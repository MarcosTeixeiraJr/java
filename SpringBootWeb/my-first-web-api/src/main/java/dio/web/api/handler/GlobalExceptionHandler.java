package dio.web.api.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    // Manipulador para tratar ResponseStatusException
    @ExceptionHandler(value = {ResponseStatusException.class})
    private ResponseEntity<Object> handleResponseStatusException(ResponseStatusException e, WebRequest request) {
        ResponseError error = new ResponseError(e.getReason(), (HttpStatus) e.getStatusCode());
        return handleExceptionInternal((Exception) e, error, headers(), (HttpStatus) e.getStatusCode(), request);
    }

    // Manipulador para tratar outras exceções
    @ExceptionHandler(value = {Exception.class})
    private ResponseEntity<Object> handleGeneralException(Exception e, WebRequest request) {
        String message = messageSource.getMessage("error.server", new Object[]{e.getMessage()}, null);
        ResponseError error = new ResponseError(message, HttpStatus.INTERNAL_SERVER_ERROR);
        return handleExceptionInternal(e, error, headers(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    private HttpHeaders headers() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    private ResponseEntity<Object> handleExceptionInternal(Exception e, ResponseError error, HttpHeaders headers, HttpStatus httpStatus, WebRequest request) {
        return new ResponseEntity<>(error, headers, httpStatus);
    }
}







