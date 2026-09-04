public class CalculateTotalandAverage
{
public static int CalculateTotal(int[] marks)
    {
        int total = 0;
        for(int i=0;i<marks.length;i++)
        {
            total = total + marks[i];
        }
        return total;
    }
    public static double ShowAverage(int[] marks)
    {
        int total = CalculateTotal(marks);
        double average = (double)total / marks.length;
        return average;
    }
    public static void main(String[] args)
    {
        int[] marks = {85,72,91,68,77};
        int result = CalculateTotal(marks);
        double avg = CalculateAverage(marks);
        System.out.println("Total = "+result);
        System.out.println("Average = "+avg);
    }
}    