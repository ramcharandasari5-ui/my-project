public class StudentMarks
{
    public static boolean SearchMark(int[] marks,int targermark)
    {
        boolean found = false;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i] == targermark)
            {
                found = true;
                break;
            }
        }
    return found;
    }
    public static void main(String[] args)
    {
        int[] marks = {85,44,62,80,92};
        int targermark = 35;
        boolean result = SearchMark(marks,targermark);
        System.out.println(result);
    }
} 