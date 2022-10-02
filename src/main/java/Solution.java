public class Solution {
    public int removeElement(int[] nums, int val) {
        // if nums.length = 0, return 0
        if (nums.length == 0) {
            return 0;
        }

        // this will be our return value
        // 0 indicates the front of the array
        int validSize = 0;

        // iterate through nums and move all valid numbers to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // move to front of array
                nums[validSize] = nums[i];

                // increment validSize for next valid number
                validSize++;
            }
        }
        return validSize;
    }
}
