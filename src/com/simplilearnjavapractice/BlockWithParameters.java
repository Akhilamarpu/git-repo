package com.simplilearnjavapractice;

public class BlockWithParameters {
	 public static void main(String[] args) {
	        int dividend = 20;
	        int divisor = 0;

	        try {
	            performDivision(dividend, divisor);
	        } catch (ArithmeticException e) {
	            System.out.println("Caught an arithmetic exception: " + e.getMessage());
	        }
	    }

	    // Method that performs division and handles exceptions
	    public static void performDivision(int dividend, int divisor) {
	        try {
	            int result = dividend / divisor;
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            throw new ArithmeticException("Division by zero error");
	        }
	    }
	}


