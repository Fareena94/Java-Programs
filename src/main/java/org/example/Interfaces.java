package org.example;

interface Writes
{
void write();

}
class Pen1 implements Writes
{
	public void write()
	{
		System.out.println("I am a pen");
	}
}
class Pencil1 implements Writes
{
	public void write()
	{
		System.out.println("I am a pencil");
	}
}
public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writes w=new Pen1();
		w.write();

		 Writes w1=new  Pencil1();
		w1.write();

		
	}

}
