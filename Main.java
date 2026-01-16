package contabancaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        long account = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Account Holder: ");
        String holder = sc.nextLine();
        System.out.print("Enter Initial value: ");
        double initialValue = sc.nextDouble();

        Conta conta = new Conta(holder, initialValue, account);

        System.out.println("Account Data");
        System.out.println(conta.toString());

        System.out.print("Enter a Deposit: ");
        double deposit = sc.nextDouble();
        conta.depositar(deposit);
        System.out.println(conta.toString());

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        conta.sacar(withdraw);
        System.out.println(conta.toString());

        sc.close();
    }
}
