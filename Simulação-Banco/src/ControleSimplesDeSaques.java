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
            System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            scanner.close();
            return;
        }

        // Itera sobre os saques adicionais
        while (true) {
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            if (valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break;
            }

            if (valorSaque > saldoRestante) {
                System.out.println("Saldo insuficiente. Transacoes encerradas.");
                break;
            }

            saldoRestante -= valorSaque;
            System.out.println("Saque realizado. Limite restante: " + saldoRestante);
        }

        scanner.close();
    }
}
