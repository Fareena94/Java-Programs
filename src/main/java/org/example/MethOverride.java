package org.example;

class Employee1 {
    int EmpId;

    public void salary(int sal, String name) {
        System.out.println(name + "draws a sal of " + sal);
    }

}
class Employee2 extends Employee1 {
    public void salary(int sal, String name) {
        System.out.println(name + " earns a sal of " + sal);
    }
}

    class Employee3 extends Employee1{
        public void salary(int sal, String name){
            System.out.println("sal of "+name+ " is :" + sal);
        }
}

public class MethOverride {
    public static void main(String[] args) {
        Employee1 emp2= new Employee2();
        Employee1 emp3= new Employee3();
        emp2.salary(100000,"Faree");
        emp3.salary(200000,"Fareena");
    }
}
