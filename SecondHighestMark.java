public class SecondHighestMark
{
    public static int FindSecondHighestMark(int[] marks)
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
    public static void main(String[] args)
    {
        int[] marks = {91,42,68,62,85,72};
        int result = FindSecondHighestMark(marks);
        System.out.println("Second Highest Mark = "+result);
    }
}