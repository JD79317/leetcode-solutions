public class DecompressRLEList {
    public int[] decompressRLElist(int[] nums) {
        int arraySize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                arraySize += nums[i];
            }
        }
        int[] answer = new int[arraySize];
        int count = 0;
        int answerIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                int filler = nums[i];
                for (int i0 = 0; i0 < count; i0++) {
                    answer[answerIndex++] = filler;
                }
            } else {
                count = nums[i];
            }
        }
        return answer;
    }
}
