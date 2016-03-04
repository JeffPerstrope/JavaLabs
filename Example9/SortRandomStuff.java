package Example9;

/**
 * Created by Jeff on 3/4/2016.
 */

public class SortRandomStuff {
    public static void main(String[] args) {
        SortNameAndNumbers s1 = new SortNameAndNumbers();
        System.out.println("Names:\n");
        s1.display();
        System.out.println("\nNumbers that are sorted:\n");
        s1.sortNumbers();
    }
}
