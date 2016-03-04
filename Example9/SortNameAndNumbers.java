package Example9;

import java.util.ArrayList;

/**
 * Created by Jeff on 3/4/2016.
 */
 
 //Array list: Line 15
 //Selectional sort: Lines 43-51
 
public class SortNameAndNumbers implements DisplayNames {
    @Override
    public void display() {
        ArrayList<String> names = new ArrayList<>();

        names.add("James");
        names.add("Zach");
        names.add("Allison");
        names.add("Harry");

        for(String name : names)
        {
            System.out.println("\n" + name);
        }
    }

    public void sortNumbers()
    {
        int[] numbers = {5, 2, 4, 1, 3};
        selectionSort(numbers);
    }

    public void selectionSort(int[] nums)
    {
        int startScan, index, minIndex, minValue;
        for(startScan = 0; startScan < nums.length - 1; startScan++)
        {
            minIndex = startScan;
            minValue = nums[startScan];
            for(index = startScan + 1; index < nums.length; index++)
            {
                if(nums[startScan] < minValue)
                {
                    minValue = nums[startScan];
                    minIndex = index;
                }
            }
            nums[minIndex] = nums[startScan];
            nums[startScan] = minValue;
        }

        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
