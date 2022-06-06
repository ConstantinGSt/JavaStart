package com.startjava.lesson_2_3.guess;

public class Player {
    private String name;
    private int answer;

    Player() {
    }

    Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getAnswer() {
        return answer;
    }

    public String getName() {
        return name;
    }
}
