/**
 * Created by Jeff on 1/26/2016.
 */
 
 //Switch statement: Line 21
 
public class BookClub {

    private int books;

    public int getBooks() {
        return books;
    }
    public void setBooks(int books) {
        this.books = books;
    }

    public int rewardPoints()
    {
        int points = 0;
        switch (books)
        {
            case 0:
                points = 0;
                break;
            case 1:
                points = 5;
                break;
            case 2:
                points = 15;
                break;
            case 3:
                points = 30;
                break;
            default:
                if(books >= 4)
                {
                    points = 60;
                }
                break;
        }
        return points;
    }
}
