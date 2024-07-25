class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }
    private void merge(int[] nums, int left, int right, int mid) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = nums[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = nums[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                nums[k++] = L[i++];
            } else {
                nums[k++] = R[j++];
            }
        }

        while (i < n1) {
            nums[k++] = L[i++];
        }

        while (j < n2) {
            nums[k++] = R[j++];
        }
    }
    private void sort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            sort(nums, left, mid);
            sort(nums, mid + 1, right);
            merge(nums, left, right, mid);
        }
    }
}
