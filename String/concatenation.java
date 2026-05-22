package String;

public class concatenation 
{
    public static void main(String[] args) 
    {
        StringBuffer sb=new StringBuffer("Virat");

         System.out.println(sb);
        //StringBuffer sb="";invalid
        sb.append("Kohli");
        System.out.println(sb);
        StringBuilder sb1=new StringBuilder("Virat");

        System.out.println(sb1);
        //StringBuffer sb="";invalid
        sb.append("Kohli");
        System.out.println(sb1);
         
        final int a=10;
        //a=20; does not change
        System.out.println(a);
        final StringBuffer sb2=new StringBuffer("Virat");
        sb2.append("kohli");
        System.out.println(sb2);
        sb=new StringBuffer("Sachin");
        System.out.println(sb2);
	    StringBuilder sb3=new StringBuilder();
        System.out.println(sb3.capacity());
        sb3.append("abcdefghijklmnop");
        System.out.println(sb3.capacity());
        sb3.append("s");
        System.out.println(sb3.capacity());//how many character you can add
        System.out.println(sb3.length());//how many character r present

        StringBuffer sb4=new StringBuffer("Sachin");
        System.out.println(sb4);
        System.out.println(sb4.capacity());
        System.out.println(sb4.charAt(1));
       sb2.setCharAt(1, 'A'); //SAachin or SAchin
       System.out.println(sb4);

    StringBuilder sb5=new StringBuilder(150);
    System.out.println(sb5.capacity());
    sb.append("java");
    System.out.println(sb5);
    sb.trimToSize();
    System.out.println(sb5.capacity());

    StringBuilder sb6=new StringBuilder("pwjava");
    System.out.println(sb6);
    System.out.println(sb6.reverse());
    
        
    }
    
}

