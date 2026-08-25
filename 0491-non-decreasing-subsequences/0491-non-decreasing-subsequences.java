class Solution {
    Set<List<Integer>> list = new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(0,new ArrayList<>(),nums);
        return new ArrayList<>(list);
    }
   void backtracking(int start,List<Integer> curr,int []nums){
        if(curr.size()>1) list.add(new ArrayList<>(curr));
        for(int i =start;i<nums.length;i++){
            if (curr.isEmpty() || curr.get(curr.size() - 1) <= nums[i]) {
            curr.add(nums[i]);
            backtracking(i+1,curr,nums);
            curr.remove(curr.size()-1);
            }
        }
    }
}