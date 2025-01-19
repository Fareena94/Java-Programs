package org.example;

import java.util.*;

class EmptyQue extends Exception {
    public EmptyQue(String message) {
        super(message);
    }
}
interface Eatable{
    public static void display1(){
        System.out.println("in display1 meth..");
    }
    public default void display2(){
        System.out.println("in display 2meth..");
    }
}

class Emp {
    private int id;
    private float balance;

    public int getid(){
        return id;
    }
    public void setid(int idno){
    id =idno;
    }
    public float getbalnc(){
        return balance;
    }
    public void setblnc(int balance){
        this.balance=balance;
    }

}
class Outer{
    public void show(){
        System.out.println("In Outer");
    }
    class Inner{
        public void display(){
            System.out.println("In Inner");
        }
        class InInner{
            public void hidden(){
                System.out.println("In InInner");
            }
        }
        public void objects(){
            Inner in=new Inner();
            InInner iIn=in.new InInner();
            in.display();
            iIn.hidden();
        }
    }

//class A{
//    public void sum(int a, int b){
//        int sum=a+b;
//        System.out.println(sum);
//    }
//}
//class B extends A{
//        public void sum(int a, int b){
//            float sum=a+b+1;
//            System.out.println(sum);
//        }
//}
//class C extends A{
//    public void sum(int a, int b){
//        int sum=a+b+3;
//        System.out.println(sum);
//    }
    public int prod(int a, int b){
        int prod=a*b;
        System.out.println(prod);
        return prod;
    }
}
class Pali{
    public static void main(String[] args) {
        String name = "amma";
        char[] ch=name.toCharArray();
        String dummy="";
        int size = ch.length;
       for(int i=size-1; i>=0;i--)
        {
            dummy = dummy+(ch[i]);
        }
        System.out.println(dummy);
        if(dummy.equals(name))
        {
            System.out.println(name +" is palindrome");
        }
        else
        {
            System.out.println(name +" is not palindrome");
        }
        String rev=new StringBuilder(name).reverse().toString();
        if(rev.equals(name)){
            System.out.println("with sb:");
            System.out.println(name +" is palindrome");
        }
        else
        {
            System.out.println(name +" is not palindrome");
        }

//Integer
        int num= 123;
        int orig =num;
        int dup =0;
        while(num>0){
            dup = dup*10+num%10;
            num = num/10;
        }
        if(orig==dup)
        {
            System.out.println(orig+" is palindrome");
        }
        else
        {
            System.out.println(orig +" is not palindrome");
        }
        int numb=121;
        String number=Integer.toString(numb);
        System.out.println(number);
        String sb = new StringBuilder(number).reverse().toString();
        if(number.equals(sb))
        {
            System.out.println(numb+" is palindrome");
        }
        else
        {
            System.out.println(numb +" is not palindrome");
        }
    }
    }

public class occurance {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Name");
        set.add("Age");
        set.add("Dob");
        for(Object obj:set){
            System.out.println(obj);
        }
        System.out.println(set.remove("Dob"));
        System.out.println(set.stream().spliterator());
        Iterator<String> itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
class Queues{
    public static void main(String[] args) {
        String string ="gevu567736egvejhdfya45";
        int sum=0;
        char[] ch=string.toCharArray();
        for(Character chars : ch)
        if(Character.isDigit(chars)){
            sum=sum+Character.getNumericValue(chars);
        }
        System.out.println(sum);
    }

}



class Prime {
    public static void main(String[] args) {
        int nm=15;
        int count=0;
        for(int i=2;i<=nm;i++) {
            if (nm % i == 0) {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(nm+"is prime");
        }
        else
            System.out.println(nm+"is not prime");
    }
    }
class Sup{
    public Sup()
    {
        System.out.println("in sup");
    }
    public Sup(int a)
    {
        System.out.println("in Parameterrized const of Sup");
    }
}
class Sub extends Sup{

    public Sub()
    {
        super(5);
        System.out.println("in sub");
    }
    public Sub(int a)
    {
        super(5);
        System.out.println("in Parameterized const of Sub");
    }

}
class Additions{
    public void sum(int...i){
        int sum=0;
        for(int j:i)
        {
            sum=sum+j;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
    }
class Ads{
    public static void main(String[] args) {

        String sentence= "please leave fareena alone!";

        String[] string = sentence.split("");
        for(String strings: string )
        System.out.println(strings);
//        char[] ch=sentence.toCharArray();
//        int count = ch.length;
//        Map<Character , Integer> map= new HashMap<>();
//
//        for(Character words: ch) {
//            if(Character.isAlphabetic(words))
//            if (map.containsKey(words)) {
//                map.put(words, map.get(words) + 1);
//            } else
//                map.put(words, 1);
//        }
//        System.out.println(map);
//        System.out.println(map.entrySet());
//        System.out.println(map.keySet());
//        for(Object obj:map.keySet()){
//            System.out.print(obj);
//        }

    }
}
class NewAds{
    public static void main(String[] args) {

        int num = 15;

        for(int i=2;i<=num;i++) {
            boolean isP = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isP = false;
                }
            }
            if (isP) {
                System.out.println(i);
            }
        }

    }
    }