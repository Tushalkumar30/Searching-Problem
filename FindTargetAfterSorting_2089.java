class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int countTarget =0, lessTarget = 0;
        for( int i =0; i < nums.length; i++){
            if( nums[i] < target ){
                lessTarget++;
            }
            if( nums[i] == target){
                countTarget++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for( int i =0; i < countTarget; i++){
            result.add( lessTarget + i);
        }
         /* Using sort
         Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
       
        for( int i = 0; i < nums.length; i++){
            if( nums[i]== target){
                result.add(i);
            }
        }*/
        return result;
    }
    
}
