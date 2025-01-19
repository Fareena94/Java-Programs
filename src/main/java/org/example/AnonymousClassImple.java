package org.example;
interface Implementor {
	void show();
}
class AnonymousClassImple
{
	public static void main(String args[])
	{
		Implementor imp= () -> System.out.println("Annyeoghaseyo");
	
		
	imp.show();		
	}
}