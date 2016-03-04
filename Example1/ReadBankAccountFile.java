/**
 * Created by Jeff on 2/25/2016.
 */

import java.io.*;
import java.util.Scanner;

public class ReadBankAccountFile {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        BankAccountFile file = new BankAccountFile();

        int recordNumber;
        String again;
        BankAccount account;

        System.out.printf("Exercise10.dat file has %d accounts\n", file.getNumberOfRecords());

        do
        {
            System.out.print("Enter the number of the account you would like to see: ");
            recordNumber = keyboard.nextInt();

            keyboard.nextLine();

            file.moveFilePointer(recordNumber);
            account = file.readBankAccount();

            System.out.printf("Balance: $%,.2f\n", account.getBalance());
            System.out.printf("Interest rate: %.2f%%\n", account.getInterest());

            System.out.print("Do you want to see another account? (Y/N): ");
            again = keyboard.nextLine();

        } while(again.charAt(0) == 'Y' || again.charAt(0) == 'y');

        file.close();
    }
}
