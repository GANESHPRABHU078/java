class Solution {
    public int largestInteger(int[] nums, int k) {

        int[] fre = new int[51];
        for (int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }
            for (int x : set) {
                fre[x]++;
            }
        }
        int ans = -1;
        for (int i = 0; i <= 50; i++) {
            if (fre[i] == 1) {
                ans = i;
            }
        }
        return ans;
    }
}