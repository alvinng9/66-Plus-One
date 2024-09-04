package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void plusOneTest() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1,2,4}, solution.plusOne(new int[]{1,2,3}));
        assertArrayEquals(new int[]{4,3,2,2}, solution.plusOne(new int[]{4,3,2,1}));
        assertArrayEquals(new int[]{1,0}, solution.plusOne(new int[]{9}));
    }

}