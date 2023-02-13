package com.example.game;

public class AdditionQuestion {
    private final int number1;
    private final int number2;

    private final int answer;

    public AdditionQuestion(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;

        answer = this.number1 + this.number2;
    }

    public boolean guess(int guess) {
        return answer == guess;
    }
}
