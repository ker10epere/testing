package com.interview;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class MathProblemTest {
    static Stream<Arguments> parameters() {
        return Stream.of(
                of(null, null),
                of(numbers(), null),
                of(numbers(1), null),
                of(numbers(1, 2), 1),
                of(numbers(1, null), null),
                of(numbers(1, 2, 3), 2)
        );
    }

    static List<Integer> numbers(Integer... nums) {
        return Arrays.asList(nums);
    }

    @ParameterizedTest
    @MethodSource("parameters")
//    @Test
    void secondMax(List<Integer> nums, Integer output) {
        /*

        BOUNDARY
        OFF POINTS:
        input size = 1
        input size = 0
        input null
        input list null

        ON POINTS:
        input size = 2
        input size > 1


        Partitions:
        INPUTS
        valid input, input size > 1.
        invalid input, input size = 1.
        invalid input, empty input.
        invalid input, list null

        OUTPUTS
        null, or any numbers.

        SPECIAL CASES:
        empty and null values.



        SPECIFICATION TEST CASE:
        input size = 1 [x], output null [x]
        input size = 0 [x], output null [x]
        input size = null [x], output null [x]
        input size = 2 (1,2)[x], output n [x]
        input (null...) size < 2 [x], output null [x]
        input size > 2 [x], output n [x]

        SPECIAL TEST CASES
        input null [x]
        input size = 0 [x]
        output null [0]


        TEST CASES:
        SPECIAL CASES:
        T[1] = input null, output null
        T[2] = input size = 0, output null
        T[3] = input (1) [1], output null

        SPECIFICATION CASES:
        T[4] = input [1,2] || out 1
        T[4] = input [1,null] || out null
        T[4] = input [1,2,3] || out 2
         */
        assertEquals(MathProblem.secondMax(nums),output);
    }

    @Test
    void secondMin() {
    }
}