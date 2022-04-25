package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumber { 
	public static void main(String[] args) throws IOException {
		int secretNumber = 75;
		int answer = 0;
		
		System.out.println("Hello! We start game - Guess Number!");
		System.out.println("");
		System.out.println("You have to guess the number from 1 to 100");
		
		while(secretNumber != answer) {
			System.out.println("Enter your number:");
		
			answer = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
				if(secretNumber > answer) {
					System.out.println("Your number less secret number");
				} else if(secretNumber < answer) {
					System.out.println("Your number more secret number");
				} else if(secretNumber == answer) {
					System.out.println("You Win! Congratulations!");
				}
		}
	}

}