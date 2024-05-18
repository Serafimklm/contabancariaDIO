import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CONTA BANCARIA");
        System.out.println("digite o número de sua agencia ");
        int agencia = scanner.nextInt();

        System.out.println("digite o numero da sua conta ");
        int conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("digite seu nome ");
        String nome = scanner.nextLine();


        System.out.println("digite o saldo que deseja depositar: ");
        int saldo = scanner.nextInt();


        System.out.println("Olá, " +nome + " ,obrigado por cirar um conta em nosso banco! \n Sua agencia é " +
                agencia + "\n Sua conta " +conta + "\n saldo atual: " +saldo);
    }
}