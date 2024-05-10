package App;
public class MSNMenssenger extends ServicoMensagemInstatanea {
    
   @Override
   public void enviarMensagem() {
    validarConectandoInternet();
    System.out.println("Enviando mensagem pelo MSN Menssenger");
   }

   @Override
   public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo MSN Menssenger");
   }
}