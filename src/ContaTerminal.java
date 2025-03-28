//importação do scanner e do teclado local us.

import java.util.Scanner;
import java.util.Locale;
/** 
*<h1>Banco Terminal</h1>
*<p>O scanner verifica com o usuario via terminal suas informaçoes 
*e recebe seus valores para que no final do progama
*o usuario seja recebido no novo banco de acordo com suas informaçoes. 
*/
public class ContaTerminal{
    public static void main(String[] args){
        //variavel scanner.
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
        float saldo = 251;
        //Mensagem de bem vindo.
        System.out.println("Ola, seja bem vindo ao banco central.\n");
        
        System.out.println("Digite o número da sua conta: ");
        int numero_Conta = scanner.nextInt();
        
        System.out.println("Digite a agencia:(Insira o '-')");
        String agencia_Conta = scanner.next();

        System.out.println("Digite o seu nome: ");
        String Nome_Cliente = scanner.next();
        
        //Verifica se o nome é igual a EDUARDO (Meu nome), se for igual, o saldo fica igual a 2000.
        if (Nome_Cliente.equals("EDUARDO")){
            saldo = 2000;}

        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco.\nSua agencia é %s, conta número %d e seu saldo de R$%.2f ja esta disponivel para saque.",Nome_Cliente,agencia_Conta,numero_Conta, saldo);
        
    }
}