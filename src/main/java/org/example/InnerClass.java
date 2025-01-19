//package org.example;
//
//
//import com.google.gson.internal.bind.util.ISO8601Utils;
//import io.cucumber.java.sl.In;
//
//class Outer{
//    public void show(){
//        System.out.println("In Outer class");
//    }
//    class Inner1{
//        public void display(){
//            System.out.println("In Inner 1 class");
//        }
//        class InInner{
//            public void visible(){
//                System.out.println("in ininner class");
//        }
//        }
//        public void inObj()
//        {
//            Inner1 in1= new Inner1();
//            InInner in2=in1.new InInner();
//            in2.visible();
//            in1.display();
//        }
//    }
//    static class Inner2{
//        public void appear(){
//            System.out.println("In static inner class");
//        }
//    }
//
//}
//public class InnerClass {
//    public static void main(String[] args) {
//        Outer out=new Outer();
//        out.show();
//        Outer.Inner1 in1= out.new Inner1();
//        in1.inObj();
//        in1.display();
//        Outer.Inner2 in2= new Outer.Inner2();
//        in2.appear();
//    }
//}
