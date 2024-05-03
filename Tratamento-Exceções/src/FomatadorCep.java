
public class FomatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Erro ao formatar o CEP");
        }
    }
    
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // simulando o cep formatado
        return "23.765-064";
    }
}

class CepInvalidoException extends Exception {
    public CepInvalidoException() {
        super("CEP inválido");
    }
}
