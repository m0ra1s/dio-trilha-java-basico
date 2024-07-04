import java.lang.reflect.AnnotatedWildcardType;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        //Exibir as mensagens para o usuário e obter pela Scanner os valores digitados no terminal

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Seja bem-vinda(o) ao nosso banco. Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Qual o seu nome? ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo disponível: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem da conta criada

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
