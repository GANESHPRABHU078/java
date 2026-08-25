class Solution {
    int count =0;
    public int numSquarefulPerms(int[] nums) {
        Arrays.sort(nums);
        boolean seen[]= new boolean[nums.length];
         backtracking(nums,-1,0,seen);
         return count;
    }
   void  backtracking(int []nums,int last,int l,boolean seen[]){
        if(l==nums.length) {
            count++;
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(seen[i]) continue;
            if(i>0&&nums[i]==nums[i-1]&&!seen[i-1]) continue;
            int s =(int)Math.sqrt(last+nums[i]);
            if(last==-1||s*s==last+nums[i]){
                seen[i]=true;
                backtracking(nums,nums[i],l+1,seen);
                seen[i]=false;
            } 
        }      
    }
}