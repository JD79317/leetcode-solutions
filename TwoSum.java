public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int i0 = 0; i0 < nums.length; i0++) {
                int next = nums[i0];
                if (i0 != i) {
                    if (num + next == target) {
                        return new int[]{i, i0};
                    }
                }
            }
        }
        return null;
    }
}
