package com.example.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionQuestionTest {
    @Test
    @DisplayName("[GIVEN] 1 & 2 [WHEN] guess = 3 [THEN] isGuessCorrect = true")
    void returnsTrueWhenGuessIsCorrect() {
        //given: Addition question with attributes number1=1 and number2=2, and guess=3 -- new AdditionQuestion(1, 2) guess = 3
        //when: Check is guess correct for addition question -- isGuessCorrect(guess)
        //then: We expect true because the guess is correct

        AdditionQuestion subject = new AdditionQuestion(1, 2);
        int guess = 3;

        assertThat(subject.isGuessCorrect(guess)).isTrue();
    }

    @Test
    @DisplayName("[GIVEN] 1 & 2 [WHEN] guess = 5 [THEN] isGuessCorrect = false")
    void returnsFalseWhenGuessIsNotCorrect() {
        //given: Addition question with attributes number1=1 and number2=2, and guess=3 -- new AdditionQuestion(1, 2) guess = 5
        //when: Check is guess correct for addition question -- isGuessCorrect(guess)
        //then: We expect false because the guess is not correct

        AdditionQuestion subject = new AdditionQuestion(1, 2);
        int guess = 5;

        assertThat(subject.isGuessCorrect(guess)).isFalse();
    }
}
