package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

	public static void main(String[] args) {
		Wolf barsik = new Wolf();
		barsik.setName("Barsik");
		barsik.setColor("Gray");
		barsik.setAge(5);
		barsik.setWeight(23.5);
		String barsikName = barsik.getName();
		String barsikColor = barsik.getColor();
		int barsikAge = barsik.getAge();
		double barsicWeight = barsik.getWeight();
		System.out.println("Wolf name - " + barsikName + ", " + barsikName+ " color - "
			 + barsikColor + ", age - " + barsikAge+", " +"Weight - " + barsicWeight);  
		barsik.howling();
		barsik.run();
		barsik.eat();
		barsik.sleep();
	}

}
