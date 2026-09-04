public class HighestMark
{
    public static int FindHighestMark(int[] marks)
    {
        int highestmark = marks[0];
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i] > highestmark)
            {
                highestmark = marks[i];
            }
        }
        return highestmark;
    }
    public static void main(String[] args)
    {
        int[] marks = {47,76,73,71,63,83,98};
        int result = FindHighestMark(marks);
        System.out.println("Highest Mark = "+result);
    }
}