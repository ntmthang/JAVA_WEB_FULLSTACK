package com.vn;

import com.vn.controller.Calculator;

public class Main {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		calculator.setA(5);
		calculator.setB(6);
		calculator.setC("/");
		float result = calculator.calculator();

		System.out.println(result);
	}

}
