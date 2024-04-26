package operadores;

public class OperadorLog {
    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdeiras");
        }

        System.out.println("fim");


        if(condicao1 || condicao2){
            System.out.println("uma das  condições é verddeiras");
        }

        System.out.println("fim");
    }
}

// && operador lógico "E"
// || operador lógico "OU"