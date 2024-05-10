public class Carros extends Veiculo {
    
    @Override
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel() {
        System.out.println("CONFERINDO COMBÚSTIVEL");
    }
    private  void confereCambio() {
        System.out.println("CONFERINDO CAMBIO");
    }
}
