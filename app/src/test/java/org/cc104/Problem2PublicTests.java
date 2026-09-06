package org.cc104;

import org.cc104.solutions.Problem2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Problem2PublicTests {

    private final Problem2 problem2 = new Problem2();

    @Test
    public void testFindMissingElementLinear_Public1() {
        int[] nums = {1, 2, 3, 4, 6};
        int result = problem2.findMissingElementLinear(nums);
        assertEquals(5, result, "Public Test 2.1: Linear search should return 5");
    }

    @Test
    public void testFindMissingElementBinary_Public1() {
        int[] nums = {1, 2, 3, 4, 6};
        int result = problem2.findMissingElementBinary(nums);
        assertEquals(5, result, "Public Test 2.1: Binary search should return 5");
    }

    @Test
    public void testFindMissingElementLinear_Public2() {
        int[] nums = {2, 3, 4, 5, 6};
        int result = problem2.findMissingElementLinear(nums);
        assertEquals(1, result, "Public Test 2.2: Linear search should return 1 (missing at start)");
    }

    @Test
    public void testFindMissingElementBinary_Public2() {
        int[] nums = {2, 3, 4, 5, 6};
        int result = problem2.findMissingElementBinary(nums);
        assertEquals(1, result, "Public Test 2.2: Binary search should return 1 (missing at start)");
    }

    @Test
    public void testFindMissingElementLinear_Public3() {
        int[] nums = {1, 2, 3, 4, 5};
        int result = problem2.findMissingElementLinear(nums);
        assertEquals(6, result, "Public Test 2.3: Linear search should return 6 (missing at end)");
    }

    @Test
    public void testFindMissingElementBinary_Public3() {
        int[] nums = {1, 2, 3, 4, 5};
        int result = problem2.findMissingElementBinary(nums);
        assertEquals(6, result, "Public Test 2.3: Binary search should return 6 (missing at end)");
    }

    @Test
    public void testFindMissingElementLinear_Public4() {
        int[] nums = {1, 3};
        int result = problem2.findMissingElementLinear(nums);
        assertEquals(2, result, "Public Test 2.4: Linear search should return 2");
    }

    @Test
    public void testFindMissingElementBinary_Public4() {
        int[] nums = {1, 3};
        int result = problem2.findMissingElementBinary(nums);
        assertEquals(2, result, "Public Test 2.4: Binary search should return 2");
    }

    @Test
    public void testFindMissingElementLinear_Public5() {
        int[] nums = {10, 11, 12, 13, 14, 15, 16, 17, 19};
        int result = problem2.findMissingElementLinear(nums);
        assertEquals(18, result, "Public Test 2.5: Linear search should return 18");
    }

    @Test
    public void testFindMissingElementBinary_Public5() {
        int[] nums = {10, 11, 12, 13, 14, 15, 16, 17, 19};
        int result = problem2.findMissingElementBinary(nums);
        assertEquals(18, result, "Public Test 2.5: Binary search should return 18");
    }
}