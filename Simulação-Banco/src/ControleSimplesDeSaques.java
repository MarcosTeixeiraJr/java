import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double primeiroSaque = scanner.nextDouble();
        double saldoRestante = limiteDiario - primeiroSaque;

        // Realiza o primeiro saque
        if (primeiroSaque <= limiteDiario) {
            System.out.println("Saque realizado. Limite restante: " + saldoRestante);
        } else {
            System.out.println("Limite diário de saque atingido. Transações encerradas.");
            scanner.close();
            
        }

        // Itera sobre os saques adicionais
        for (int i = 1; ; i++) {
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break;
            }

            if (valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break;
            }

            if (valorSaque > saldoRestante) {
                System.out.println("Saldo insuficiente. Transações encerradas.");
                break;
            }

            saldoRestante -= valorSaque;
            System.out.println("Saque realizado. Limite restante: " + saldoRestante);
        }

        scanner.close();
    }
}