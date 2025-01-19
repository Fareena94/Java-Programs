package org.example;

class Girls{
    int age ;
   static String name;

    public void sammy()
    {
        name = "Jyothsna";
        System.out.println("Sammy real name is Jyothsna");
    }
    static
    {
        name = "Maanya";
        System.out.println("Maanya is unique");
    }

    public void cals()
    {
        name= "Kalyani";
        System.out.println("Kalyani is cals");
    }
    static
    {
        name = "Kunnu";
        System.out.println("Maanys is called Kunnu at home");
    }
}
public class StaticKey {
    public static void main(String[] args) {
        Girls g=new Girls();
        g.cals();
        g.sammy();
       
    }
}
