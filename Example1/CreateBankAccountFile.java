/**
 * Created by Jeff on 2/25/2016.
 */

import java.io.*;
import java.util.Scanner;

public class CreateBankAccountFile {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        final int NUM_ITEMS = 5;
        double balance, interestRate;

        BankAccount[] accounts = new BankAccount[NUM_ITEMS];

        System.out.printf("Enter data for %d bank accounts\n\n", NUM_ITEMS);

        for(int i = 0, x = 1; i < accounts.length; i++, x++)
        {
            System.out.printf("Enter the balance for account %d: ", x);
            balance = keyboard.nextDouble();

            System.out.printf("Enter the interest rate for account %d: ", x);
            interestRate = keyboard.nextDouble();

            accounts[i] = new BankAccount(balance, interestRate);
            System.out.println("");
        }

        BankAccountFile file = new BankAccountFile();

        for(int i = 0; i < accounts.length; i++)
        {
            file.writeBankAccount(accounts[i]);
        }

        file.close();

        System.out.println("The information was written to the Exercise10.dat file");
    }
}
