package com.vn.controller;

public class Calculator {
	private float a;
	private float b;
	private String c;

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public float calculator() {
		switch (c) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		default:
			return a / b;
		}

	}
}
