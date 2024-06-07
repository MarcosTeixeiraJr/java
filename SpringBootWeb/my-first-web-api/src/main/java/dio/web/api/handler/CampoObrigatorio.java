package dio.web.api.handler;

public class CampoObrigatorio extends BusinessException{
    public CampoObrigatorio(String campo) {
        super("O campo %s é obrigatório", campo);
    }

}
