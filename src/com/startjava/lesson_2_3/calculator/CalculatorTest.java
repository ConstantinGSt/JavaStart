package com.startjava.lesson_2_3.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorTest {
	public static void main(String[] args) throws IOException {
		char againWhile;
		Calc calculation = new Calc();
		do {
			
					
			System.out.println("Calculation start\n");
			
			System.out.println("Input first number");
			BufferedReader firstNum = new BufferedReader(new InputStreamReader(System.in));
			double inputA = Double.parseDouble(firstNum.readLine());
			calculation.setA(inputA);
			
			System.out.println("Input action");
			BufferedReader action = new BufferedReader(new InputStreamReader(System.in));
			char inputAction = (char) action.read();
			
			System.out.println("Input two number");
			BufferedReader secondNum = new BufferedReader(new InputStreamReader(System.in));
			double inputB = Double.parseDouble(secondNum.readLine());
			calculation.setB(inputB);
			
			calculation.calculation(inputAction);
			System.out.println(calculation.getResult());	
			do {
				System.out.println("\nYou want to use the calculator again? \nInput \"y\" (yes) or \"n\" (no).");
				BufferedReader again = new BufferedReader(new InputStreamReader(System.in));
				againWhile = (char) again.read();
			} while (againWhile !='y' & againWhile !='n');
		} while (againWhile =='y');
	}
}
