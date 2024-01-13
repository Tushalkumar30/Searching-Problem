class Solution {
    public int search(int[] arr, int target) {
        int ans = binarySearch(arr, target);
        return ans;
    }
    static int binarySearch( int[] arr, int target){
        int start =0;
        int end = arr.length - 1;
        while( start <= end){
            int mid = start + ( end - start) / 2;
            if( arr[mid] == target){
                return mid;
            }
            if(arr[ mid] >= arr[start]){
                // left sorted
                if(arr[start] <= target && arr[mid] >= target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                // right sorted
                if(arr[mid] <= target && arr[end] >= target){
                    start = mid + 1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
