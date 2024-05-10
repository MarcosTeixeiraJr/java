package App;
public class FacebookMenssenger extends ServicoMensagemInstatanea{

    @Override
    public void enviarMensagem() {
        validarConectandoInternet();
        System.out.println("Enviando mensagem pelo Facebook Menssenger");
       }
    
    @Override
       public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Menssenger");
       }
}
