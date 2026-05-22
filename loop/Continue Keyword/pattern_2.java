public class pattern_2 
{
    public static void main (String[] args)
    {
       for(int i=1; i<=7; i++)
       {
        for(int j=1; j<=i; j++)
        {
            System.out.print(i+ " ");
             if(j==i)
            {
                System.out.println(" ");
                continue;
            }
           
        }
        
       }
    }
}
