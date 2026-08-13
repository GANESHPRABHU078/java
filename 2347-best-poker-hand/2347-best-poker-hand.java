class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int fre[] = new int[26];
        int freq[] = new int[14];
        for (int i : ranks)
            fre[i]++;
        for (char c : suits)
            freq[c - 'a']++;
        for (int i : freq) {
            if (i == 5)
                return "Flush";
        }
        for (int i : fre) {
            if (i >= 3)
                return "Three of a Kind";
        }
        for (int i : fre)
            if (i == 2)
                return "Pair";
        return "High Card";
    }
}