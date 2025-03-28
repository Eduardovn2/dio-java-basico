import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
        float saldo = 0;

        System.out.println("Ola, seja bem vindo ao banco central.\n");
        
        System.out.println("Digite o número da sua conta: ");
        int numero_Conta = scanner.nextInt();
        
        System.out.println("Digite a agencia:(Insira o '-')");
        String agencia_Conta = scanner.next();

        System.out.println("Digite o seu nome: ");
        String Nome_Cliente = scanner.next();

        if (Nome_Cliente.equals("EDUARDO")){
            saldo = 2000;}
        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco.\nSua agencia é %s, conta número %d e seu saldo de R$%.2f ja esta disponivel para saque.",Nome_Cliente,agencia_Conta,numero_Conta, saldo);
        
    }
}