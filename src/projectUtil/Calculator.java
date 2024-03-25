package projectUtil;

import mathsUtil.Addition;
import mathsUtil.Division;
import mathsUtil.Multiplication;
import mathsUtil.Substraction;

public class Calculator {

    public static void main(String[] args) {

        Addition addition = new Addition();
        addition.addition(20,5);
        Substraction substraction = new Substraction();
        substraction.substraction(30,20);
        Multiplication multiplication = new Multiplication();
        multiplication.multiplication(5,5);
        Division division = new Division();
        division.division(5,5);

    }
}
