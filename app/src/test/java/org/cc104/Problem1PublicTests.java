package org.cc104;

import org.cc104.solutions.Problem1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Problem1PublicTests {

    private final Problem1 problem1 = new Problem1();

    @Test
    public void testCountOccurrencesLinear_Public1() {
        int[] nums = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int result = problem1.countOccurrencesLinear(nums, target);
        assertEquals(3, result, "Public Test 1.1: Linear search should return 3 for target 2");
    }

    @Test
    public void testCountOccurrencesBinary_Public1() {
        int[] nums = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int result = problem1.countOccurrencesBinary(nums, target);
        assertEquals(3, result, "Public Test 1.1: Binary search should return 3 for target 2");
    }

    @Test
    public void testCountOccurrencesLinear_Public2() {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 1;
        int result = problem1.countOccurrencesLinear(nums, target);
        assertEquals(5, result, "Public Test 1.2: Linear search should return 5 for target 1");
    }

    @Test
    public void testCountOccurrencesBinary_Public2() {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 1;
        int result = problem1.countOccurrencesBinary(nums, target);
        assertEquals(5, result, "Public Test 1.2: Binary search should return 5 for target 1");
    }

    @Test
    public void testCountOccurrencesLinear_Public3() {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 2;
        int result = problem1.countOccurrencesLinear(nums, target);
        assertEquals(0, result, "Public Test 1.3: Linear search should return 0 for target not in array");
    }

    @Test
    public void testCountOccurrencesBinary_Public3() {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 2;
        int result = problem1.countOccurrencesBinary(nums, target);
        assertEquals(0, result, "Public Test 1.3: Binary search should return 0 for target not in array");
    }

    @Test
    public void testCountOccurrencesLinear_Public4() {
        int[] nums = {};
        int target = 5;
        int result = problem1.countOccurrencesLinear(nums, target);
        assertEquals(0, result, "Public Test 1.4: Linear search should return 0 for empty array");
    }

    @Test
    public void testCountOccurrencesBinary_Public4() {
        int[] nums = {};
        int target = 5;
        int result = problem1.countOccurrencesBinary(nums, target);
        assertEquals(0, result, "Public Test 1.4: Binary search should return 0 for empty array");
    }

    @Test
    public void testCountOccurrencesLinear_Public5() {
        int[] nums = {5};
        int target = 5;
        int result = problem1.countOccurrencesLinear(nums, target);
        assertEquals(1, result, "Public Test 1.5: Linear search should return 1 for single element array");
    }

    @Test
    public void testCountOccurrencesBinary_Public5() {
        int[] nums = {5};
        int target = 5;
        int result = problem1.countOccurrencesBinary(nums, target);
        assertEquals(1, result, "Public Test 1.5: Binary search should return 1 for single element array");
    }
}