import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
         //criando o objeto scanner
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();


        //imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm");
        scanner.close();
        }
        catch (InputMismatchException e) {
            System.err.println("O campo idade e altura precisam ser numéricos");
        }
    }
}
