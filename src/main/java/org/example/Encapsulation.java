package org.example;

class Students
{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int roll) {
		rollno = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Students stu=new Students();
 stu.setRollno(5);
 stu.setName("Fareena");
 System.out.println(stu.getRollno());
 System.out.println(stu.getName());
	}

}
