package org.example;

class Calcu
{
	int sum;
	public void add(int ... i) // is accepting an array from main meth //... gonna accept any length of values
	{
		for(int j:i)
		{
			sum=sum+j;
		}
		System.out.println(sum);
	}
}
public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcu c=new Calcu();
     c.add(1,4,34,56,24);
	}

}
