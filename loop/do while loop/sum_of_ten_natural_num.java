public class sum_of_ten_natural_num 
{
    public static void main(String[] args)
    {
        int i=1,sum=0;
        do
        {
          sum=sum+i;
          i++;
        }
        while(i<=11);
        System.out.println("First 11 natural number is="+sum);
    }
}


