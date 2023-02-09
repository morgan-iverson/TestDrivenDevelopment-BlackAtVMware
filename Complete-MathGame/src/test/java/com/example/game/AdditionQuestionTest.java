package com.example.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionQuestionTest {
    @Test
    @DisplayName("GIVEN: Addition question with attributes number1=1 and number2=2 WHEN: Get correct answer for addition question THEN: The correct answer to our addition question equals 3")
    void canGetCorrectAnswer() {
        //given: Addition Question (number1 = 1 number2 = 2)
        //when: Get Correct Answer
        //then: Result = 3

        AdditionQuestion subject = new AdditionQuestion(1, 2);
        int actualResponse = subject.getCorrectAnswer();
        int expectedResponse = 3;

        assertEquals(actualResponse, expectedResponse);

        System.out.println("GIVEN: Addition question with attributes number1=1 and number2=2\nWHEN: Get correct answer for addition question\nTHEN: The correct answer to our addition question equals 3");
    }

    @Test void returnsTrueWhenGuessIsCorrect() {
        //given: Addition Question (number1 = 1; number = 2)
        //when:
        //then:

        AdditionQuestion subject = new AdditionQuestion(1, 2);
        int guess = 3;
        boolean actualResponse = subject.isGuessCorrect(guess);
        boolean expectedResponse = true;

        assertEquals(actualResponse, expectedResponse);
    }

    @Test void returnsFalseWhenGuessIsNotCorrect() {
        //given:
        //when:
        //then:

        AdditionQuestion subject = new AdditionQuestion(1, 2);
        int guess = 5;
        boolean actualResponse = subject.isGuessCorrect(guess);
        boolean expectedResponse = false;

        assertEquals(actualResponse, expectedResponse);
    }
}
