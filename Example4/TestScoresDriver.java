/**
 * Created by Jeff on 2/22/2016.
 */
public class TestScoresDriver {
    public static void main(String[] args) {
        double testScores[] = {99, 92.5, 80, 101};

        try
        {
            TestScores ts1 = new TestScores(testScores);
            System.out.printf("Average: %.2f%%", ts1.getAverage(testScores));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error: There was an invalid test score");
        }
    }
}
