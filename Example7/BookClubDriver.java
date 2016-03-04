/**
 * Created by Jeff on 1/26/2016.
 */

import java.util.Scanner;

public class BookClubDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BookClub b1 = new BookClub();

        System.out.print("Books purchased: ");
        int userBooks = keyboard.nextInt();
        b1.setBooks(userBooks);
        int rewardPoints = b1.rewardPoints();

        System.out.printf("Reward points: %d", rewardPoints);
    }
}
