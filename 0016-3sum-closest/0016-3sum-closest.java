class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int close =nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int left=i+1;
            int rigth=nums.length-1;
            while(left<rigth){
                int sum =nums[i]+nums[left]+nums[rigth];
                if(Math.abs(sum-target)<Math.abs(close-target)){
                close = sum;
                }
                if(sum==target) return sum;
                 if(sum>target){
                    rigth--;
                }
                else left++;

            }
        }
        return close;
    }
}