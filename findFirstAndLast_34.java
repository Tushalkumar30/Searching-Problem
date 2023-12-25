class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start =0;
        int end = nums.length -1;
        int first = -1, last =-1;
        while( start <= end){
            
            int mid = start + ( end - start) / 2;
            if( target < nums[mid]){
                end = mid -1;
            }
            else if( target > nums[mid]){
                start = mid+1;
            }
            else{
                first = mid;
                last = mid;
                while( first > 0 && nums[first -1] == target){
                    first--;
                }
                while( last < nums.length -1 && nums[last +1] == target){
                    last++;
                }
                break;
            }
        }
        return new int[] {first,last};
    }
}
