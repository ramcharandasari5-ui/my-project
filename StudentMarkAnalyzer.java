public class StudentMarkAnalyzer
{
    public static int CalculateTotal(int[] marks)
    {
        int total = 0;
        for(int i = 0; i < marks.length; i++)
        {
            total = total + marks[i];
        }
        return total;
    }
    public static double CalculateAverage(int[] marks)
    {
        int total = CalculateTotal(marks);
        double average = (double) total / marks.length;
        return average;
    }
    public static int CountPassingMarks(int[] marks)
    {
        int count = 0;
        for(int i = 0; i<marks.length; i++)
        {
            if(marks[i] >= 50)
            {
                count = count + 1;
            }
        }
        return count;
    }
    public static int FindHighestMark(int[] marks)
    {
        int highestmark = marks[0];
        for(int i = 1; i< marks.length; i++)
        {
            if(marks[i] > highestmark)
            {
                highestmark = marks[i];
            }
        }
        return highestmark;
    }
    public static int FindSecondHigestMark(int[] marks)
    {
        int first = -1;
        int second = -1;
        for(int i = 0; i < marks.length; i++)
        {
            int current = marks[i];
            if(current > first)
            {
                second = first;
                first = current;
            }
            else if(current > second)
            {
                second = current;
            }
        }
        return second;
    }
    public static int FindLowestMark(int[] marks)
    {
        int lowestmark = marks[0];
        for(int i = 1; i < marks.length; i++)
        {
            if(marks[i] < lowestmark)
            {
                lowestmark = marks[i];
            }
        }
        return lowestmark;
    }
    public static int FindSecondLowestMark(int[] marks)
    {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0; i < marks.length; i++)
        {
            int current = marks[i];
            if(current < first)
            {
                second = first;
                first = current;
            }
            else if(current < second)
            {
                second = current;
            }
        }
        return second;
    }
    public static boolean SearchMark(int[] marks, int targetmark)
    {
        boolean found = false;
        for(int i = 0; i < marks.length; i++)
        {
            if(marks[i] == targetmark)
            {
                found = true;
                break;
            }
        }
        return found;
    }
    public static int CountMarkOccurrences(int[] marks, int targetmark)
    {
        int count = 0;
        for(int i = 0; i < marks.length; i++)
        {
            if(marks[i] == targetmark)
            {
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] marks = {85,42,85,91,68,42,35,72,68,85,80};
        int total = CalculateTotal(marks);
        double avg = CalculateAverage(marks);
        int passCount = CountPassingMarks(marks);
        int high = FindHighestMark(marks);
        int secondHigh = FindSecondHigestMark(marks);
        int low = FindLowestMark(marks);
        int secondLow = FindSecondLowestMark(marks);
        boolean found = SearchMark(marks, 42);
        int countOccrur = CountMarkOccurrences(marks, 85);
        System.out.println("Total: " +total);
        System.out.println("Average: " +avg);
        System.out.println("Pass Count: " +passCount);
        System.out.println("Highest Mark: " +high);
        System.out.println("Second Higest Mark: " +secondHigh);
        System.out.println("Lowest Mark: " +low);
        System.out.println("Second Lowest Mark: " +secondLow);
        System.out.println("Found: " +found);
        System.out.println("Count Mark Occurrences = " +countOccrur);
    }
}