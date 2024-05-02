import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agenciaCliente;
        String nomeCliente;
        double saldoContaCliente;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Deseja abrir uma conta nova ? (S/N)");
        String escolhaAbrirConta = scanner.next();

        if (escolhaAbrirConta.equals("S")) {
            System.out.print("Digite o numero da conta: ");
            numeroConta = scanner.nextInt();
            System.out.print("Digite a agência da conta: ");
            agenciaCliente = scanner.next();
            System.out.print("Digite o nome do cliente: ");
            nomeCliente = scanner.next();
            System.out.print("Digite o saldo inicial da conta: ");
            saldoContaCliente = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaCliente + ", conta " + numeroConta + " e seu saldo  " + saldoContaCliente  + " já está disponivel para saque.");
        }else{
            System.out.println("Operação finalizada !");
        }
        scanner.close();
    }
}
