// BusinessException.java
package dio.web.api.handler;

public class BusinessException extends RuntimeException {

    // Construtor para criar uma BusinessException com uma mensagem
    public BusinessException(String mensagem) {
        super(mensagem);
    }

    // Construtor para criar uma BusinessException com uma mensagem formatada e parâmetros
    public BusinessException(String mensagem, Object... params) {
        super(String.format(mensagem, params));
    }
}

