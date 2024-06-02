package sample2.MainOverloading;

public class A {
    public static void main(String[] args) {


        main(10);
        main("aa");


        System.out.println("original main ");
    }
    public static void main(int num) {
        System.out.println("overload int parameter"+ num);
    }
    public static void main(String s) {
        System.out.println("overload string parameter" +s);

    }
}
