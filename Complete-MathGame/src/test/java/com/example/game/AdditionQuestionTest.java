package com.example.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdditionQuestionTest {

    @DisplayName("Given: 1 and 4 When: Guess 5 Then: True")
    @Test
    void guessCorrectAnswer() {
        int number1 = 1;
        int number2 = 4;
        var subject = new AdditionQuestion(number1,number2);

        assertTrue(subject.guess(5));
    }
}
