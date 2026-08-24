class Solution {

    public int longestBalanced(String s) {
        int n = s.length();
        int max = 0;

        for (int start = 0; start < n; start++) {
            int[] freq = new int[26];

            for (int end = start; end < n; end++) {
                freq[s.charAt(end) - 'a']++;

                if (isBalanced(freq)) {
                    max = Math.max(max, end - start + 1);
                }
            }
        }

        return max;
    }

    private boolean isBalanced(int[] freq) {
        int common = 0;

        for (int f : freq) {
            if (f == 0) continue;

            if (common == 0) {
                common = f;
            } else if (f != common) {
                return false;
            }
        }

        return true;
    }
}