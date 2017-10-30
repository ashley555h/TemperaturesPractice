import static java.lang.System.out;

public class practiceNumberArrays 
{
    public static void main(String[] args)
    {
        int[] temperaturesWeekOne = { 65, 68, 72, 83, 73, 66, 85 };
        int sumWeekOne = 0;
        int[] temperaturesWeekTwo = { 86, 87, 85, 78, 79, 78, 80 };
        int sumWeekTwo = 0;
        String warmestDayWeekOne = "Saturday";
        String warmestDayWeekTwo = "Monday";
        int warmestDegreeWeekOne = 85;
        int warmestDegreeWeekTwo = 87;
        
        System.out.println("Week 1 High Temperatures");
        System.out.println("65, 68, 72, 83, 73, 66, 85");
        System.out.println("");
        System.out.println("Week 2 High Temperatures");
        System.out.println("86, 87, 85, 78, 79, 78, 80");
        System.out.println("");
        
        for (int indexOne = 0; indexOne < temperaturesWeekOne.length; indexOne++)
        {
         sumWeekOne += temperaturesWeekOne[indexOne];   
        }
        float averageTemperatureWeekOne = sumWeekOne / (float)temperaturesWeekOne.length;
        
        for (int indexTwo = 0; indexTwo < temperaturesWeekTwo.length; indexTwo++)
        {
         sumWeekTwo += temperaturesWeekTwo[indexTwo];   
        }
        float averageTemperatureWeekTwo = sumWeekTwo / (float)temperaturesWeekTwo.length;
        
        System.out.println("The average daily-high temperature for week 1 is " + averageTemperatureWeekOne);
        System.out.println("The average daily-high temperature for week 2 is " + averageTemperatureWeekTwo);
        System.out.println("In week 1, " + warmestDayWeekOne + " was warmest, at " + warmestDegreeWeekOne + " degrees.");
        System.out.println("In week 2, " + warmestDayWeekTwo + " was warmest, at " + warmestDegreeWeekTwo + " degrees.");

    }
}