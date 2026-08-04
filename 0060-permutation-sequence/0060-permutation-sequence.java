class Solution {
    List<List<Integer>> list =new ArrayList<>();
    public String getPermutation(int n, int k) {
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        boolean seen []=new boolean[nums.length];
        backtracking(nums,new ArrayList<>(),seen);
        System.out.print(list.get(k-1));
        String s ="";
        for(int i:list.get(k-1)) s=s+(i+"");
        return s;
    }
     public  void backtracking(int []nums,List<Integer> curr,boolean[] seen){
        if(curr.size()==nums.length){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(seen[i]) continue;
            curr.add(nums[i]);
               seen[i]=true;
               backtracking(nums,curr,seen);
               curr.remove(curr.size()-1);
                seen[i]=false;
        }
    }
}