package Logical;

public class demo {

    public static void main(String[] args) {
        int a=20;
        int b=30;
        int c= 40;
        if(a<b && a<c)
        {
            System.out.println("A is younger");
        } else if (b<a && b<c) {
            System.out.println("b is younger");

        }
        else {
            System.out.println("c is younger");
        }
    }
}
