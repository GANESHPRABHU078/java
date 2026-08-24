class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans [] = new int[nums.length*2];
        int i=0;
        for(;i<nums.length;i++){
            ans[i]=nums[i];
        }
        for(int j =nums.length-1;j>=0;j--){
            ans [i++]=nums[j];
        }
        return ans;
    }
}