package com.operatorsAdvanced;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2;

        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        double add = number1 + number2;
        double subtract = number1 - number2;
        double multiply = number1 * number2;
        double divide = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of two numbers " + 
        number1 + " and " + number2 +
                " is " + add + ", " + subtract + 
                ", " + multiply + ", and " + divide);
        
        input.close();
    }
}
