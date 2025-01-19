package org.example;
class Subk{
    Subk(){
    }
    static Subk instance;
    public static Subk getInstance()
    {
        if(instance==null) {
            instance = new Subk();
        }
        return instance;
    }
}
public class SingletonClass {

    public static void main(String[] args) {
        Subk su= Subk.getInstance();
        System.out.println(su);

        Subk s = Subk.getInstance();
        System.out.println( s);
    }

}
