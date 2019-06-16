package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{
	
	private double firstNumber;
	private double secondNumber;
	private double result;

	public MyCalculator(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	@Override
	public void add() {
		this.result = firstNumber + secondNumber;
		System.out.println(result);
		
	}

	@Override
	public void subtract() {
		this.result = firstNumber - secondNumber;
		System.out.println(result);
	}

	@Override
	public void multiply() {
		this.result = firstNumber * secondNumber;
		System.out.println(result);
		
	}

	@Override
	public void devide() {
		this.result = firstNumber / secondNumber;
		System.out.println(result);
	}
	
	

}
