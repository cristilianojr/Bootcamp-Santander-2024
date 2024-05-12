package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args) throws Exception {
        
        Scanner ask = new Scanner(System.in);
        
        System.out.println("Bem vindo ao Banco");

        System.out.println("Digite o numero da conta: ");
        int number = ask.nextInt();
        ask.nextLine();

        System.out.println("Digite a agencia: ");
        String agency = ask.nextLine();

        System.out.println("Digite o seu nome: ");
        String name = ask.nextLine();

        System.out.println("Digite o seu saldo: ");
        double balance = ask.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", name, agency, number, balance );
        ask.close();
    }

}
