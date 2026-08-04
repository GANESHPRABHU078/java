class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        boolean seen []=new boolean[nums.length];
        backtracking(nums,new ArrayList<>(),seen,list);
        return list;
    }
  public  void backtracking(int []nums,List<Integer> curr,boolean[] seen,List<List<Integer>> list){
        if(curr.size()==nums.length){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(seen[i]) continue;
            curr.add(nums[i]);
               seen[i]=true;
               backtracking(nums,curr,seen,list);
               curr.remove(curr.size()-1);
                seen[i]=false;
        }
    }
}