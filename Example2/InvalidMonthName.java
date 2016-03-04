/**
 * Created by Jeff on 2/23/2016.
 */
public class InvalidMonthName extends Exception{

    public InvalidMonthName()
    {
        super("Error: One of the month names does not exist");
    }

}
