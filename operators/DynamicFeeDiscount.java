package com.operators;


import java.util.Scanner;
public class DynamicFeeDiscount {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double fee, discountPercent;

	        System.out.print("Enter course fee (INR): ");
	        fee = input.nextDouble();

	        System.out.print("Enter discount percentage: ");
	        discountPercent = input.nextDouble();

	        double discount = (fee * discountPercent) / 100;
	        double finalFee = fee - discount;

	        System.out.println("The discount amount is INR " + discount +
	        		" and final discounted fee is INR " + finalFee);
	        
	        input.close();
	    }

}
