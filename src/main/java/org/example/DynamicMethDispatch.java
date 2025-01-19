package org.example;

class C
{
	public void show()
	{
		System.out.println("Meth C");	
	}
}
 
class D extends C
{
	public void show()
	{
		
		System.out.println("Meth D");
	}
	public void visible()
	{
		System.out.println("visible");
	}
}
class E extends C
{
	public void show()
	{
		
		System.out.println("Meth E");
	}
}

public class DynamicMethDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new D();//run-time plymorphism
		obj.show();
		obj=new E();//Dynamic Meth dispatch
		obj.show();
	}

}
