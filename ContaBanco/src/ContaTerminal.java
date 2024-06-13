import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        int numeroConta;
        String agenciaConta;
        String nomeCliente;
        double saldoConta;

        // Coleta de dados do cliente via terminal
        System.out.println("## Abertura de Conta Bancária ##");

        System.out.print("Por favor, digite o número da agência: ");
        agenciaConta = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        numeroConta = scanner.nextInt();

        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Digite o seu nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        saldoConta = scanner.nextDouble();

        // Mensagem de boas-vindas personalizada
        String mensagemBoasVindas = "Olá " + nomeCliente + ",\n" +
                "Obrigado por criar uma conta em nosso banco!\n" +
                "Sua agência é: " + agenciaConta + "\n" +
                "Número da conta: " + numeroConta + "\n" +
                "Saldo disponível para saque: R$ " + saldoConta + "\n";

        System.out.println("\n" + mensagemBoasVindas);

        scanner.close();
    }
}
