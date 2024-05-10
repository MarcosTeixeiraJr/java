package Default;
import App.FacebookMenssenger;
import App.MSNMenssenger;
import App.ServicoMensagemInstatanea;
import App.Telegram;

public class ComputadorPedrinho {
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

    }
}
