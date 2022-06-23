package com.tanu.inheritence;

public class Test {

	public static void main(String[] args) {
		String[] projects = new String[] { "Flight reservation", "Check in" };
		Manager manager = new Manager(1, "Devendra", "Travel", 1000000, projects);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		System.out.println(manager.salary);
		manager.work();

		Developer developer = new Developer(2, "Tanu", "Travel", 20000, "Ui developer");
		developer.work();
	}

}
