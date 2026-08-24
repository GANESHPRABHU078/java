class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String s = "";
        for(String c : words){
            int n =0;
            for(char ch:c.toCharArray()){
                 n+=weights[ch-'a'];
            }
            n%=26;
            s+=(char)('z'-n);
        }
        return s;
    }
}