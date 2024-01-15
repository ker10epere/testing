package com.interview;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MathProblemTest {
    @Test
    void secondMaxEmptyNums() {
        List<Integer> emptyNums = List.of();

        assertNull(MathProblem.secondMax(null));
        assertNull(MathProblem.secondMax(emptyNums));
    }

    @Test
    void secondMaxNumsSizeOne() {
        List<Integer> singleList = List.of(1);
        List<Integer> nullList = new ArrayList<>() {{
            add(null);
        }};

        assertNull(MathProblem.secondMax(singleList));
        assertNull(MathProblem.secondMax(nullList));
    }

    @Test
    void secondMaxNumsSizeTwo() {
        List<Integer> validList = List.of(2, 1);
        List<Integer> listWithNull = new ArrayList<>() {{
            add(1);
            add(null);
        }};

        assertEquals(MathProblem.secondMax(validList), 1);
        assertNull(MathProblem.secondMax(listWithNull));
    }

    @Test
    void secondMaxNumsMoreThanTwo() {
        List<Integer> validList = List.of(3, 2, 1);
        List<Integer> listWithNullOne = new ArrayList<>() {{
            add(1);
            add(null);
        }};
        List<Integer> listWithNullTwo = new ArrayList<>() {{
            add(1);
            add(null);
            add(3);
        }};

        assertEquals(MathProblem.secondMax(validList), 2);
        assertNull(MathProblem.secondMax(listWithNullOne));
        assertEquals(MathProblem.secondMax(listWithNullTwo), 1);
    }

    @Test
    void secondMin() {
    }
}
/*
        PARTITIONS
        [[INPUTS]]
        [nums]
        nums = null
        nums = size 0
        nums = size 1
        nums = size 2
        nums = size > 2
        nums = size 2 with null item

        [[OUTPUTS]]
        [out]
        out = null
        out = numbers


        BOUNDARIES
        [[ON POINTS]]
        [nums]
        nums = size 2
        nums = size > 2

        [[OFF POINTS]]
        [nums]
        nums = null
        nums = size 0
        nums = size 1
        nums = size 2 with null item
        nums = size n with null items


        IDENTIFY PARTITION NOT TO BE TESTED MULTIPLE TIMES MARKED WITH [x]
        nums = null [x], empty [x], size 1 [x], size 2 [x], size > 2


        DERIVED TEST CASES
        [exceptional test cases]
        T[1] = nums null
        T[2] = nums empty list

        [nums size 1]
        T[3] = nums [1]
        T[4] = nums [null]

        [nums size 2]
        T[5] = nums [1,2]
        T[6] = nums [1,null]

        [nums size > 2]
        T[7] = nums [1,2,3]
        T[8] = nums [1,2,null]
        T[8] = nums [1,2,null,4]
*/