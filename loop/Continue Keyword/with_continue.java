public class with_continue 
{
    public static void main(String[] args)
    {
        for(int i=0; i<10; i++)
        {
            if(i == 5)
            {
                continue;
            }
            else
            {
                System.out.print(i+" ");
                System.out.println("Danish");
            }
        }
    }
}
