public class grading_system 
{
    public static void main(String[] args)
    {
        int marks=101;
        if(marks>=80 && marks<=100)
        {
            System.out.print("Grade A");
        }
        else if(marks>=60 && marks<80)
        {
            System.out.print("Grade B");
        }
        else if(marks>=40 && marks<60)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Grade D");
        }
    }
}
