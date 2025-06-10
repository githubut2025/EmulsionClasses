package Day_1;

import java.util.Scanner;

public class AllProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Welcome to Bridgelabz
        System.out.println("1. Welcome to Bridgelabz!");
        System.out.println("Welcome to Bridgelabz!\n");

        // 2. Add Two Numbers
        System.out.println("2. Add Two Numbers");
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum + "\n");

        // 3. Celsius to Fahrenheit Conversion
        System.out.println("3. Celsius to Fahrenheit Conversion");
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "\n");

        // 4. Area of a Circle
        System.out.println("4. Area of a Circle");
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area + "\n");

        // 5. Volume of a Cylinder
        System.out.println("5. Volume of a Cylinder");
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.println("Volume of the cylinder: " + volume + "\n");

        // 6. Calculate Simple Interest
        System.out.println("6. Calculate Simple Interest");
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest + "\n");

        // 7. Perimeter of a Rectangle
        System.out.println("7. Perimeter of a Rectangle");
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter: " + perimeter + "\n");

        // 8. Power Calculation
        System.out.println("8. Power Calculation");
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();
        double power = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + power + "\n");

        // 9. Average of Three Numbers
        System.out.println("9. Average of Three Numbers");
        System.out.print("Enter number 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter number 3: ");
        double n3 = sc.nextDouble();
        double average = (n1 + n2 + n3) / 3;
        System.out.println("Average: " + average + "\n");

        // 10. Convert Kilometers to Miles
        System.out.println("10. Convert Kilometers to Miles");
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Distance in miles: " + miles);

        sc.close();
    }
}

