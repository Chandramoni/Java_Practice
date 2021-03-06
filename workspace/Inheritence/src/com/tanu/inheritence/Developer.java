package com.tanu.inheritence;

public class Developer extends Employee {
	String technology;

	public Developer(int id, String name, String dept, double salary, String technology) {
		super(id, name, dept, salary);
		this.technology = technology;
		System.out.println("Inside developer constructor");
	}

	@Override
	protected void work() {
		super.work();
		System.out.println("Developer is working on " + technology);
	}
}
