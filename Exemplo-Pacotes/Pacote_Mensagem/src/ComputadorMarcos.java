import Apps.FacebookMenssenger;
import Apps.MSNMenssenger;
import Apps.ServicoMensagemInstatanea;
import Apps.Telegram;

public class ComputadorMarcos {
    
    public static void main(String[] args) {
        ServicoMensagemInstatanea smi = null;
        /*
         * Não se sabe qual app 
         * mais qualquer um deverá enviar e receber mensagem
         */
        String appEscolhido = "msn";

        if (appEscolhido.equals("msn"))
            smi = new MSNMenssenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMenssenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();

        smi.validarConectandoInternet();
    }
}
