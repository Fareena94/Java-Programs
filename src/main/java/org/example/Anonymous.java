package org.example;

interface Family{
    void mother();
}
class Mom{
    void family(){
        System.out.println("Mother is root of family");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        Family fam =()->
                System.out.println("sibblings");
            fam.mother();
            Mom mom=new Mom(){
                void family(){
                    System.out.println("Mother is the back bone of Family");
                }
            };
            mom.family();
    }
}

