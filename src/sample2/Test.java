package sample2;

public class Test {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.Calculate(10,10);
        c.Calculate(10,20,30);
        c.Calculate(10.1,20.20);
        c.Calculate(10,20);
    }
}
