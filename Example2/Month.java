/**
 * Created by Jeff on 2/4/2016.
 */
 
 //Overloaded methods: Line 21 & 47
 //Overloaded constructor: Line 72 & 78
 //Running total: Line 23 & 37
 //Override equals method: Line 93
 //Sequential search: Line 21 or 47
 //Comparing string: Line 30
 
public class Month {

    private int numMonth;
    private String monthName;

    private int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    private String names[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December"};

    public void searchName(String value) throws InvalidMonthName
    {
        int index;
        boolean found;
        index = 0;
        found = false;

        while(!found && index < names.length)
        {
            if(names[index].equalsIgnoreCase(value))
            {
                found = true;
                numMonth = numbers[index];
                monthName = names[index];
            }

            index++;
        }

        if(found == false)
        {
            throw new InvalidMonthName();
        }

    }

    public void searchNum(int value) throws InvalidMonthNumber
    {
        int index;
        boolean found;
        index = 0;
        found = false;

        while(!found && index < numbers.length)
        {
            if(numbers[index] == value)
            {
                found = true;
                numMonth = numbers[index];
                monthName = names[index];
            }

            index++;
        }

        if(found == false)
        {
            throw new InvalidMonthNumber();
        }
    }

    public Month()
    {
        numMonth = 1;
    }


    public Month(String m)
    {
        monthName = m;
    }


    public int getNumMonth() {
        return numMonth;
    }

    @Override
    public String toString() {
        return "Month #: " + numMonth + "\nMonth: " + monthName;
    }

    public boolean equals(Month m2) {
        boolean e = false;
        if(this.numMonth == m2.numMonth)
        {
            e = true;
        }
        return e;
    }

    public boolean greaterThan(Month m2)
    {
        boolean greater = false;
        if(this.numMonth > m2.numMonth)
        {
            greater = true;
        }
        return greater;
    }

    public boolean lessThan(Month m2)
    {
        boolean less = false;
        if(this.numMonth < m2.numMonth)
        {
            less = true;
        }
        return less;
    }

    public void setNumMonth(int numMonth) {
        this.numMonth = numMonth;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }
}
