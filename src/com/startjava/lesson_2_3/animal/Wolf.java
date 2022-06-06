package com.startjava.lesson_2_3.animal;

public class Wolf {
	private String name;
	private String color;
	private int age;
	private double weight;

	public void run() {
		System.out.println(name + " run");
	}
	
	public void eat() {
		System.out.println(name + " eat");
	}
	
	public void sleep() {
		System.out.println(name + " sleep");
	}
	
	public void howling() {
		System.out.println(name + " howling");
	}

	// get/set ---------------

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 8) {
			System.out.println("your wolf die=)), enter another value age");
		} else this.age = age;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}