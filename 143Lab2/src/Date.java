

/*
 * Date class will take in a date and determine if it is a 
 * valid date.
 */
public class Date
{
	//data members are month, day, and year and should be instance variables
    private int m;
    private int d;
    private int y;
    
    /**
     * no-arg constructor
     */
    public Date()
    {
        this.m = 7;
        this.d = 3;
        this.y = 2001;
    }
    
    public Date(int m, int d, int y)
    {
        setDate(m, d, y);
    }
    
    public void setDate(int m, int d, int y)
    {
        if (m >= 1 && m <= 12)
        {
            if (d >= 1 && d <= 31)
            {
                if(y > 0 && y<= 9999)
                {
                    this.m = m;
                    this.d = d;
                    this.y = y;
                }
            }
        }
    }
    
    public int getMonth()
    {
        return m;
    }
    
    public int getDay()
    {
        return d;
    }
    
    public int getYear()
    {
        return y;
    }
    
    public void report()
    {
        System.out.println(getMonth() + "/" + getDay() + "/" + getYear());
    }
    
    public String toString()
    {
        return getMonth() + "/" + getDay() + "/" + getYear();
    }
    
}
