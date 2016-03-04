/**
 * Created by Jeff on 2/25/2016.
 */
 
 //Do-while loop: Line 22

import java.io.*;
import java.util.Scanner;

public class ModifyAccount {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        BankAccountFile file = new BankAccountFile();

        int recordNumber;
        String again, sure;
        BankAccount account;
        double balance, interestRate;

        System.out.printf("Exercise10.dat file has %d records\n\n", file.getNumberOfRecords());

        do
        {
            System.out.print("Enter the number of the account you want to modify: ");
            recordNumber = keyboard.nextInt();

            keyboard.nextLine();

            file.moveFilePointer(recordNumber);
            account = file.readBankAccount();

            System.out.println("Existing information:");
            System.out.printf("\nBalance: $%,.2f", account.getBalance());
            System.out.printf("\nInterest rate: %.2f%%\n", account.getInterest());

            System.out.print("\nEnter new balance: ");
            balance = keyboard.nextDouble();
            account.setBalance(balance);
            System.out.print("Enter new interest rate: ");
            interestRate = keyboard.nextDouble();
            account.setInterestRate(interestRate);

            keyboard.nextLine();

            System.out.print("Are you sure you want to save? (Y/N): ");
            sure = keyboard.nextLine();

            if(sure.charAt(0) == 'Y' || sure.charAt(0) == 'y')
            {
                file.moveFilePointer(recordNumber);
                file.writeBankAccount(account);
            }

            System.out.print("\nDo you want to modify another account? (Y/N) ");
            again = keyboard.nextLine();

        } while(again.charAt(0) == 'Y' || again.charAt(0) == 'y');

        file.close();
    }
}
