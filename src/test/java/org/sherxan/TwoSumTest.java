package org.sherxan;

import org.junit.jupiter.api.Test;
import org.sherxam.TwoSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {


    @Test
    void validParentheses() {
        String parentheses = "{([])}()";
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 3, 7, 11};

        int[] result = twoSum.twoSum1(nums, 10);

        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }
}
