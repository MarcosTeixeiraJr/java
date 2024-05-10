package Apps;
//a classe MSNMensenger é ou representa
public abstract  class ServicoMensagemInstatanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente os filhos conhecem esse método
    protected  void validarConectandoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
}
