class Solution {
    int ans =0;
    public int subsetXORSum(int[] nums) {
        backtrack(nums,0,0);
         return ans;
    }
    void backtrack(int []nums,int start,int xor){
            if(start ==nums.length){
                ans +=xor;
                return;
            }
            backtrack(nums,start+1,xor);
            backtrack(nums,start+1,xor^nums[start]);

    }
}