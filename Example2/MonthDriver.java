/**
 * Created by Jeff on 2/4/2016.
 */
 
 //If else-if: Line 25 & 30

import java.util.Scanner;

public class MonthDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Month m1 = new Month();
        Month m2 = new Month();

        String userName1 = "", userName2 = "";
        int userNum1 = 0, userNum2 = 0;

        System.out.println("1). Enter month's name\n2). Enter month's number\n");
        System.out.print("Choose: ");
        int userChoice = keyboard.nextInt();

        keyboard.nextLine();

        System.out.print("Month: ");
        if(userChoice == 1)
        {
            userName1 = keyboard.nextLine();
            m1.setMonthName(userName1);
        }
        else if(userChoice == 2)
        {
            userNum1 = keyboard.nextInt();
            m2.setNumMonth(userNum1);
        }

        System.out.print("Month: ");
        if(userChoice == 1)
        {
            userName2 = keyboard.nextLine();
            m1.setMonthName(userName2);
        }
        else if(userChoice == 2)
        {
            userNum2 = keyboard.nextInt();
            m2.setNumMonth(userNum2);
        }

        try
        {
            if(userChoice == 1)
            {
                m1.searchName(userName1);
                m2.searchName(userName2);
            }
            else if(userChoice == 2)
            {
                m1.searchNum(userNum1);
                m2.searchNum(userNum2);
            }

            System.out.println(m1);
            System.out.println(m2);

            if(m1.equals(m2))
            {
                System.out.println("These are the same months");
            }
            else if(m1.greaterThan(m2))
            {
                System.out.println("First month is greater than the second");
            }
            else if(m1.lessThan(m2))
            {
                System.out.println("Second month is greater than the first");
            }
        }
        catch(InvalidMonthNumber mNum)
        {
            System.out.println(mNum.getMessage());
        }
        catch(InvalidMonthName mName)
        {
            System.out.println(mName.getMessage());
        }
    }
}
