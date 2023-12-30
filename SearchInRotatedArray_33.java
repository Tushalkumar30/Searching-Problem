class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) return mid;

            // pivot on left side
            if (nums[left] > nums[mid]) {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            } else { // pivot on right side or no pivot
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            }
        }

        return -1;
    }
}

// Second Solution
class Solution {
    public int search(int[] arr, int target) {
        int pivot = findpivot( arr);
        if( pivot == -1){
            return binarySearch( arr, target, 0, arr.length -1);
        }
        if( arr[pivot] == target){
            return pivot;
        }
        if( target >= arr[0]){
            return binarySearch( arr, target, 0, pivot -1);
        }
        return binarySearch( arr, target, pivot + 1, arr.length -1);
    }
    int binarySearch( int[] arr,int target, int start , int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
     int findpivot( int[] arr){
        int start =0; 
        int end = arr.length -1 ;
        while( start < end){
            int mid = start + (end - start)/2;
            if( end > mid && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if( start < mid && arr[mid] < arr[mid - 1]){
                return mid -1;
            }
            if( arr[mid ] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
