// ResponseError.java
package dio.web.api.handler;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ResponseError {

    private final LocalDateTime timestamp;
    private final String status;
    private final HttpStatus statusCode;
    private String error = "";

    public ResponseError(String status, HttpStatus statusCode) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.statusCode = statusCode;
        this.error = error;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getStatus() {
        return status;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public String getError() {
        return error;
    }
}


