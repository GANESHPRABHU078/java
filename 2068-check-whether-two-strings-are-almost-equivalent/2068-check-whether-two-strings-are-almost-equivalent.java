class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int [] f = new int[26];
        for(int i=0;i<word1.length();i++){
             f[word1.charAt(i)-'a']++;
             f[word2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(Math.abs(f[i])>3) return false;
        }
        return true;
    }
}