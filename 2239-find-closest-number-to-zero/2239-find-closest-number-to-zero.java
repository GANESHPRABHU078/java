class Solution {
    public int findClosestNumber(int[] nums) {
        int ind =0;
        int ind1=0;
        int z=Integer.MIN_VALUE;
        int p=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(z<nums[i]&&nums[i]<=0){
                z=nums[i];
                ind=i;
            }
            if(p>nums[i]&&nums[i]>=0){
                p=nums[i];
                ind1=i;
            }
        }
        System.out.println(p+" "+ind1);
         System.out.print(z+" "+ind);
        if(nums.length<2) return nums[0];
       // if(ind ==nums.length-1) return nums[ind];
        if(Math.abs(nums[ind])<nums[ind1])
        return nums[ind];
        return nums[ind1];
    }
}