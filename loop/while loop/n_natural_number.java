public class n_natural_number 
{
    public static void main(String[] args)
    {
       int i=0,num=10,sum=0;
       while(i<=num)
       {
        System.out.print(i+ " ");
        i++;
        sum=sum+i;
       }
       System.out.println();
       System.out.println("sum of ten number = "+ sum);
    }
}
