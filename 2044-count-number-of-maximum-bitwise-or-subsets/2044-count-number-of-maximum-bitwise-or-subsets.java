class Solution {
    int ans =0;
    int max =0;
    public int countMaxOrSubsets(int[] nums) {
        for(int i:nums){
            max|=i;
        }
        subset(nums,0,0);
        return ans;
    }
    void subset(int []nums,int start, int or){
        if(start==nums.length){
           if(or==max) ans++;
            return;
        }
        subset(nums,start+1,or);
         subset(nums,start+1,or|nums[start]);
    }
}