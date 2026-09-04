public class LowestMark
{
    public static int FindLowestMark(int[] marks)
    {
        int lowestmark = marks[0];
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i] < lowestmark)
            {
                lowestmark = marks[i];
            }
        }
        return lowestmark;
    }
    public static void main(String[] args)
    {
        int[] marks = {47,76,73,71,63,83,98};
        int result = FindLowestMark(marks);
        System.out.println("Lowest Mark = "+result);
    }
}