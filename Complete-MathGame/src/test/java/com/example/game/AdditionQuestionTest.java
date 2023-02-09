package com.example.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionQuestionTest {
    public static final String TEST1_CORRECT_ANSWER_DISPLAY_NAME = "GIVEN: Addition question with attributes number1=1 and number2=2\n" +
        "WHEN: Get correct answer for addition question\n" +
        "THEN: The correct answer to the addition question equals 3";
    public static final String TEST2_CORRECT_GUESS_TRUE = "GIVEN: Addition question with attributes number1=1 and number2=2 and guess=3\n" +
        "WHEN: Check is guess correct for addition question\n" +
        "THEN: We expect true because the guess is correct";
    public static final String TEST3_CORRECT_GUESS_FALSE = "GIVEN: Addition question with attributes number1=1 and number2=2 and guess=5\n" +
        "WHEN: Check is guess correct for addition question\n" +
        "THEN: We expect true because the guess is not correct";

    @Test
    @DisplayName(TEST1_CORRECT_ANSWER_DISPLAY_NAME)
    void canGetCorrectAnswer() {
        //given: Addition question with attributes number1=1 and number2=2
        //when: Get Correct Answer for Addition Question
        //then: Result of Get Correct Answer equals 3

        AdditionQuestion subject = new AdditionQuestion(1, 2);
        int actualResponse = subject.getCorrectAnswer();
        int expectedResponse = 3;

        assertEquals(actualResponse, expectedResponse);
        System.out.println(TEST1_CORRECT_ANSWER_DISPLAY_NAME);
    }

    @Test
    @DisplayName(TEST2_CORRECT_GUESS_TRUE)
    void returnsTrueWhenGuessIsCorrect() {
        //given: Addition question with attributes number1=1 and number2=2, and guess=3 -- new AdditionQuestion(1, 2) guess = 3
        //when: Check is guess correct for addition question -- isGuessCorrect(guess)
        //then: We expect true because the guess is correct

        AdditionQuestion subject = new AdditionQuestion(1, 2);
        int guess = 3;
        boolean actualResponse = subject.isGuessCorrect(guess);
        boolean expectedResponse = true;

        assertEquals(actualResponse, expectedResponse);
        System.out.println(TEST2_CORRECT_GUESS_TRUE);
    }

    @Test
    @DisplayName(TEST3_CORRECT_GUESS_FALSE)
    void returnsFalseWhenGuessIsNotCorrect() {
        //given: Addition question with attributes number1=1 and number2=2, and guess=3 -- new AdditionQuestion(1, 2) guess = 5
        //when: Check is guess correct for addition question -- isGuessCorrect(guess)
        //then: We expect false because the guess is not correct

        AdditionQuestion subject = new AdditionQuestion(1, 2);
        int guess = 5;
        boolean actualResponse = subject.isGuessCorrect(guess);
        boolean expectedResponse = false;

        assertEquals(actualResponse, expectedResponse);
        System.out.println(TEST3_CORRECT_GUESS_FALSE);
    }
}
