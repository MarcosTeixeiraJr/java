package operadores;

public class Relacionais {
    public static void main(String[] args) {

        String nome1 = "MARCOS";
        String nome2 = "MARCOS";

        System.out.println(nome1.equals (nome2));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroum é igual a numerodois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroum é diferente a numerodois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroum é maior que numerodois?" + simNao);
    }
}
