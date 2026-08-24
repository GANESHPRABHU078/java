class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum = 0;
        int [] fre = new int[101];
         for(int i:nums){
            fre[i]++;
         }
         for(int i=0;i<nums.length;i++){
            if(fre[nums[i]]==0) continue;
            if(fre[nums[i]]%k==0) sum+=nums[i];
         }
         return sum;
    }
}