/**
 * Created by Jeff on 2/22/2016.
 */
public class TestScores {

    public TestScores(double array[])
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < 0 || array[i] > 100)
            {
                throw new IllegalArgumentException();
            }
        }
    }

    public double getAverage(double array[])
    {
        double average = 0;
        for(int i = 0; i < array.length; i++)
        {
            average += array[i];
        }
        return average /= array.length;
    }


}
