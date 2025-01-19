package org.example;

 class Sum {

    public void sum(int num1,int num2){
        System.out.println(num1+num2);
    }
    public void sum(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }

}
public class MethOverload {
    public static void main(String[] args) {
        Sum s=new Sum();
        s.sum(1,2,3);
        s.sum(3,4);
    }
}

