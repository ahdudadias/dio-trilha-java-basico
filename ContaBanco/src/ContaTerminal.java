import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Declaração de variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        // Solicitação de dados ao usuário
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt(); // Inteiro
        scanner.nextLine(); // Consumir a linha restante após o número inteiro
        
        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta:");
        saldo = scanner.nextDouble();
        
        // Mensagem final com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}

