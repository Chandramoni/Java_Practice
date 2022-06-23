package com.tanu.interfaces;

public class MyCircle implements Circle, CircleTwo {

	@Override
	public void calculateArea() {
		System.out.println(CircleTwo.pi);
	}

	public static void main(String[] args) {

	}

	@Override
	public void calculateArea(float radius) {
		
	}

}
