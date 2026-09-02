public class PassingMarks
{
    public static int CountPassingMarks(int[] marks)
    {
        int count = 0;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i] >= 50)
            {
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] marks = {85,42,91,68,35,77};
        int result = CountPassingMarks(marks);
        System.out.println(result);

    }
}