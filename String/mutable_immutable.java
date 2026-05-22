package String;

public class mutable_immutable 
{
    public static void main(String[] args) 
    {
        String brand ="pwskill";
        System.out.println(brand);
        brand.concat("Chapra");
        System.out.println(brand);

        StringBuilder brand1= new StringBuilder ("Danish");
        System.out.println(brand1);
        brand1.append("chapra");
        System.out.println(brand1);
    }
}
