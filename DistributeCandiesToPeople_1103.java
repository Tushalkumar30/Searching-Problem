class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int i = 0, n = num_people;
        int[] ans = new int[n];
        int count = 0;
        while( candies > 0){
            if( i == n){
                i =0;
            }
            count++;
            if( count > candies){
                count = candies;
            }
            ans[i++] += count;
            candies = candies - count;
        }
        return ans;
    }
    
}
