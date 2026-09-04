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
    public static void main(String[] args)
    {
        int[] marks = {85,42,91,68,35,77};
        int total = CalculateTotal(marks);
        double avg = CalculateAverage(marks);
        int passCount = CountPassingMarks(marks);
        int high = FindHighestMark(marks);
        int low = FindLowestMark(marks);
        boolean found = SearchMark(marks, 42);
        System.out.println("Total: " +total);
        System.out.println("Average: " +avg);
        System.out.println("Pass Count: " +passCount);
        System.out.println("Highest Mark: " +high);
        System.out.println("Lowest Mark: " +low);
        System.out.println("Found: " +found);
    }
}