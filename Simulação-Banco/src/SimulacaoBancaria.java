import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            int opcao = scanner.nextInt();

            // Implementação das condições para avaliar a opção escolhida pelo usuário
            switch (opcao) {
                case 1: // Depósito
                    double valor_deposito = scanner.nextDouble();
                    saldo += valor_deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2: // Saque
                    double valor_sacado = scanner.nextDouble();
                    if (valor_sacado <= saldo) {
                        saldo -= valor_sacado;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3: // Consultar saldo
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0: // Encerrar
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}

