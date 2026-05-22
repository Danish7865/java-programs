public class one_to_hundred_print_new_line_buzz
{
    public static void main(String[] args)
    {
        int i=1;
        for(i=1;i<=100;i++)
        {
            if(i%3==0)
        {
            System.out.println("Fizz");
        }
        if(i%5==0)
        {
            System.out.println("Buzz");
        }
         if(i%15==0)
        {
            System.out.println("FizzBuzz");
        }
            System.out.println(i);
        }
       
    }
}