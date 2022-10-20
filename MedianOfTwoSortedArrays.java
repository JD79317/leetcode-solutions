public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, array, 0, nums1.length);
        System.arraycopy(nums2, 0, array, nums1.length, nums2.length);
        while (!isSorted(array)) {
            for (int i = 0; i < array.length; i++) {
                int fst = array[i];
                int snd = array[i == array.length - 1 ? i : i + 1];
                if (fst > snd) {
                    array[i + 1] = fst;
                    array[i] = snd;
                }
            }
        }
        int middle = array.length / 2;
        if (array.length % 2 != 0) {
            return array[middle];
        } else {
            return (array[middle] + array[middle - 1]) / 2F;
        }
    }

    private boolean isSorted(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num < max) {
                return false;
            } else {
                max = num;
            }
        }
        return true;
    }
}
