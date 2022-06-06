package com.startjava.lesson_2_3.guess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GuessNumberTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Player first input your namme: ");
        Player p1 = new Player(reader.readLine());
        System.out.print("Player second input your namme: ");
        Player p2 = new Player(reader.readLine());
        System.out.println("Our players: " + p1.getName() + " and " + p2.getName());
        GuessNumber game = new GuessNumber(p1, p2);

        game.startGame();
    } 
}
