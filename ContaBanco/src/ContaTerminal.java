import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta.");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência.");
        String numeroAgencia = scanner.next();
        System.out.println("Por favor, digite o seu nome.");
        String nomeCliente = scanner.next();
        scanner.nextLine();
        System.out.println("Por favor, digite o saldo inicial.");
        double saldo = scanner.nextDouble();
        System.out.println("\nOlá, " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco.\nSua agência é " + numeroAgencia + 
            ", conta " + numeroConta + 
            " e seu saldo R$" + saldo + " já está disponível para saque.");
        scanner.close();
    }  
}