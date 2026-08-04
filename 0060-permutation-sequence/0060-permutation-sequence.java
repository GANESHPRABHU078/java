class Solution {
    List<StringBuilder> list =new ArrayList<>();
    public String getPermutation(int n, int k) {
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        boolean seen []=new boolean[nums.length];
        backtracking(nums,new StringBuilder(),seen);
        return list.get(k-1).toString();
    }
     public  void backtracking(int []nums,StringBuilder curr,boolean[] seen){
        if(curr.length()==nums.length){
            list.add(new StringBuilder(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(seen[i]) continue;
            curr.append(nums[i]);
               seen[i]=true;
               backtracking(nums,curr,seen);
               curr.deleteCharAt(curr.length()-1);
                seen[i]=false;
        }
    }
}