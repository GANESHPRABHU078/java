class Solution {
    List<List<Integer>> list = new ArrayList<>();
    int[] nums;
    int k;

    public int beautifulSubsets(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
        subsets(0, new ArrayList<>());
        return list.size() - 1;
    }

    void subsets(int start, List<Integer> list1) {
        // if (ans(list1,nums[i]))
        list.add(new ArrayList<>(list1));
        for (int i = start; i < nums.length; i++) {
            if (ans(list1,nums[i])) {
                list1.add(nums[i]);
                subsets(i + 1, list1);
                list1.remove(list1.size() - 1);
            }
        }
    }

    boolean ans(List<Integer> list1, int num) {
        for (int x : list1) {
            if (Math.abs(x - num) == k) {
                return false;
            }
        }
        return true;
    }
}