class Solution {
    public int[] sortArray(int[] nums)  {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] leftPart = new int[mid - left + 1];
        int[] rightPart = new int[right - mid];

        // Copy data to temporary arrays
        System.arraycopy(nums, left, leftPart, 0, leftPart.length);
        System.arraycopy(nums, mid + 1, rightPart, 0, rightPart.length);

        int i = 0, j = 0, k = left;

        // Merge back into original array
        while (i < leftPart.length && j < rightPart.length) {
            if (leftPart[i] <= rightPart[j]) {
                nums[k] = leftPart[i];
                i++;
            } else {
                nums[k] = rightPart[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < leftPart.length) {
            nums[k] = leftPart[i];
            i++;
            k++;
        }
        while (j < rightPart.length) {
            nums[k] = rightPart[j];
            j++;
            k++;
        }
        // end of the merge method
    }
}