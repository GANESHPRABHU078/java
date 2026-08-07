class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list= new ArrayList<>();
        for(int j=0;j<nums.length-3;j++){
             if(j > 0 && nums[j] == nums[j - 1])
                continue;

            for(int i=j+1;i<nums.length-2;i++){
             if(i > j + 1 && nums[i] == nums[i - 1])
                    continue;
            int left=i+1;
            int rigth=nums.length-1;
            while(left<rigth){
                long sum =(long)nums[i]+nums[left]+nums[rigth]+nums[j];
                if(sum==target){
                    list.add(Arrays.asList(nums[j],nums[i],nums[left],nums[rigth]));
                
                while(left<rigth&&nums[left]==nums[left+1]){
                        left++;
                }
                while(left<rigth&&nums[rigth]==nums[rigth-1]){
                        rigth--;
                    
                }
               left++;
               rigth--;
                }
                else if(sum>target){
                    rigth--;
                }
                else left++;

             }
          }
        }
        return list;
    }
}