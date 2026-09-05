public class SecondLowestMark
{
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
    public static void main(String[] args)
    {
        int[] marks = {91,42,68,62,85,72};
        int result = FindSecondLowestMark(marks);
        System.out.println("Second Lowest Mark = "+result);
    }
} 