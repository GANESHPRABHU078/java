class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> list =new HashSet<>();
        HashSet<Integer> set=new HashSet<>();
         HashSet<Integer> set1=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                list.add(i);
            }
            set1.add(i);
        }
        for(int i:nums3){
            if(set.contains(i)){
                list.add(i);
            }
            if(set1.contains(i)){
                list.add(i);
            }
        }
        return new ArrayList<>(list);
    }
}