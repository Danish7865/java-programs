package String;

public class diff_ways_of_comparison 
{
    public static void main(String[]args)
    {
        String s1=("Danish");//Dublicate not allow
        String s2=("Danish");
        String s3=("DANISH");
        System.out.println(s1==s2);//== compares the reference of the object
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));//.equal compers the contents of two object
        System.out.println(s1.equals(s3));

        System.out.println(" ");

         String s4=("DANISH");
         String s5= new String("Danish");//Doublicate allow
         String s6= new String("Danish");
        System.out.println(s4==s5);
        System.out.println(s5==s6);
        System.out.println(s4.equalsIgnoreCase(s5));
        System.out.println(s4.equals(s6));
    }
}
