package org.cc104.solutions;

public int findMissingElementLinear(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        int expected = nums[0] + i;

        if (nums[i] != expected) {
            return expected;
        }
    }

    return nums[nums.length - 1] + 1;
}

public int findMissingElementBinary(int[] nums) {
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
        int mid = (low + high) / 2;
        int expected = nums[0] + mid;

        if (nums[mid] != expected) {

            if (mid == 0 || nums[mid - 1] == nums[0] + mid - 1) {
                return expected;
            }

            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return nums[nums.length - 1] + 1;
}
