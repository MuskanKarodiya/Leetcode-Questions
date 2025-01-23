class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2;
        cnt += mergeSort(arr, low, mid);  // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += countPairs(arr, low, mid, high); // Count reverse pairs
        merge(arr, low, mid, high);  // Merging sorted halves
        return cnt;
    }

    private int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2L * arr[right]) right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    private void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // Temporary array
        int left = low;      // Starting index of left half of arr
        int right = mid + 1;   // Starting index of right half of arr

        // Storing elements in the temporary array in a sorted manner
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // If elements on the left half are still left
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // If elements on the right half are still left
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Transferring all elements from temporary to arr
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}