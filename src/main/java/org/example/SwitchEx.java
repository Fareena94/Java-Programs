package org.example;

public class SwitchEx {
    public static void main(String[] args) {
        String name = "Maanya";
        switch(name)
        {
            case "Fareena" :
                System.out.println("My name is Fareena");
                break;
            case "Maanvi" :
                System.out.println("During Marriage Fareena was name as Maanvi");
                break;
            case "Maanya":
                System.out.println("Fareena's daughter is Maanya");
                break;
            case "Kunnu":
                System.out.println("Maanya's nick name is Kunnu");
                break;
            default:
                System.out.println("No match found");
        }
    }
}
