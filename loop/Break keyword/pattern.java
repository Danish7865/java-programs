public class pattern 
{
    public static void main (String[] args)
    {
       for(int i=1; i<=7; i++)
       {
        for(int j=1; j<=i; j++)
        {
            System.out.print(j+ " ");
             if(i==j)
            {
                break;
            }
           
        }
        System.out.println(" ");
       }
    }
}
