package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapNumbersTest {

    @Test
    void testSwapPositiveNumbers() {
        int[] result = SwapNumbers.swap(5, 10);
        assertArrayEquals(new int[]{10, 5}, result);
    }

    @Test
    void testSwapNegativeNumbers() {
        int[] result = SwapNumbers.swap(-5, -10);
        assertArrayEquals(new int[]{-10, -5}, result);
    }

    @Test
    void testSwapMixedNumbers() {
        int[] result = SwapNumbers.swap(-7, 14);
        assertArrayEquals(new int[]{14, -7}, result);
    }

    @Test
    void testSwapWithZero() {
        int[] result = SwapNumbers.swap(0, 8);
        assertArrayEquals(new int[]{8, 0}, result);
    }

    @Test
    void testSwapSameNumbers() {
        int[] result = SwapNumbers.swap(6, 6);
        assertArrayEquals(new int[]{6, 6}, result);
    }
}
