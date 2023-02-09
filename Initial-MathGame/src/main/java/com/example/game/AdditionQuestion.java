package com.example.game;

public class AdditionQuestion {
    private int number1;
    private int number2;

    public AdditionQuestion(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getCorrectAnswer() {
        return this.number1 + this.number2;
    }

    public boolean isGuessCorrect(int guess) {
        return guess == getCorrectAnswer();
    }
}
