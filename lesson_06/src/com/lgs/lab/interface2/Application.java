package com.lgs.lab.interface2;

public class Application {

	public static void main(String[] args) {
		
		MyCalculator calculator = new MyCalculator(15, 4);
		
		calculator.add();
		calculator.subtract();
		calculator.multiply();
		calculator.devide();

	}

}
