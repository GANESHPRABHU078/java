class Solution {
    public int[] findIndices(int[] nums, int in, int v) {
        int []arr={-1,-1};
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                   if((Math.abs(i-j)>=in )&& (Math.abs(nums[i]-nums[j])>=v)){
                    arr[0]=i;
                    arr[1]=j;
                   }
            }
        }
        return arr;
    }
}