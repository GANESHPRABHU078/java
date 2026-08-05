class Solution {
    List<List<Integer>> list = new ArrayList<>();
    int []nums;
    int k;
    public int beautifulSubsets(int[] nums, int k) {
        this.nums=nums;
        this.k=k;
        subsets(0,new ArrayList<>());
        return list.size()-1;
    }
  void subsets(int start,List<Integer> list1){
         if(ans(list1)) list.add(new ArrayList<>(list1));
        for(int i=start;i<nums.length;i++){
            list1.add(nums[i]);
            subsets(i+1,list1);
            list1.remove(list1.size()-1);
        }
    }
    boolean ans(List<Integer> list1){
        for(int i=0;i<list1.size();i++){
            for(int j=i+1;j<list1.size();j++){
                if((Math.abs((list1.get(j)-list1.get(i))))==k){
                    return false;
                }
            }
        }
        return true;
    }
}