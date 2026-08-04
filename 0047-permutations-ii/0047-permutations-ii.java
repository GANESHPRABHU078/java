class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean arr[]=new boolean[nums.length];
        backtracking(0,nums,new ArrayList<>(),arr);
        return list;
    }
    void backtracking(int start,int []nums,List<Integer> list1,boolean []arr){
        if(list1.size()==nums.length){
            if(!list.contains(list1))
            list.add(new ArrayList<>(list1));
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i]) continue;
//if(i>0&&nums[i]==nums[i-1]&&!arr[i-1]) continue;
            list1.add(nums[i]);
            arr[i]=true;
            backtracking(start+1,nums,list1,arr);
            list1.remove(list1.size()-1);
            arr[i]=false;
        }
    }
}