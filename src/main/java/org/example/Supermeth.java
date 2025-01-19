package org.example;

class A {
	public A()
	{
		System.out.println("in A");
	}
	public A(int a)
	{
		System.out.println("in A int");
	}
}
class B extends A{
	public B()
	{
		super(5);
		System.out.println("in B");
	}
	public B(int a)
	{
		super();
		System.out.println("in B int");
	}
}
public class Supermeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj= new B();
		String name = "Fareena";
		char[] ch = name.toCharArray();
		String rev = "";
		for(int i = ch.length-1; i>=0; i--){
			rev = rev+ch[i];
		}
		if(rev.equals(name)){
			System.out.println("Pali");
		}
		else
			System.out.println("Not pali");


	}

}
