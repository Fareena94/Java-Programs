package org.example;

interface Readable{
    static String name="Vaartha" ;
    final float PI= 3.14F;
    default void news(){
        System.out.println("in default meth");
    }
    static void tv()
    {
        System.out.println("in static meth");
    }
}
public class InterfaceMethDeclare {
    public static void main(String[] args) {
        Readable.tv();
        Readable read= new Readable() {
            @Override
            public void news() {
                Readable.super.news();
            }
        };
        read.news();
    }
}
