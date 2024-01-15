package com.interview;

import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MathProblem {
    /*
    Create a program given a list of numbers, returns second largest number.

    given null list, returns null.
    given empty list, returns null.
    given list with size of 1, returns null.
    given list with 2 items, returns second largest number.

    Ex.
    input -> nums = [5,4,1,2,3]
    expected output -> 4, the second largest number
     */
    public static Integer secondMax(List<Integer> nums) {
        if (validateList(nums))
            return null;

        List<Integer> nonNullNumbers = nums.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        if (validateList(nonNullNumbers))
            return null;

        TreeSet<Integer> numsSet = new TreeSet<>(nonNullNumbers);
        return numsSet.lower(numsSet.last());
    }

    private static boolean validateList(List<Integer> nums) {
        return nums == null || nums.isEmpty() || nums.size() == 1;
    }

    /*
    Create a program that accepts list of numbers, and returns second smallest item.

    given null list, returns null.
    given empty list, returns null.
    given list with size of 1, returns null.
    given list with 2 items, returns second smallest number.

    Ex.
    input -> nums = [5,4,1,2,3]
    expected output -> 2, the second largest number
     */
    public static Integer secondMin(List<Integer> nums) {
        if (validateList(nums))
            return null;
        TreeSet<Integer> numsSet = new TreeSet<>(nums);
        return numsSet.higher(numsSet.first());
    }
}
