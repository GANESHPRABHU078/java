class Solution {
    public int mirrorFrequency(String s) {
        int fre [] = new int [256];
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            fre[ch]++;
            set.add(ch);
        }
        int sum=0;
        boolean[] visited = new boolean[256];
        for(char ch : set){
            if (visited[ch])
                continue;
             char c;
            if(Character.isDigit(ch))
            c=(char)('9'-(ch-'0'));
           else
           c=(char)('z'-(ch-'a'));
            sum += Math.abs(fre[ch]-fre[c]);
            visited[ch] = true;
            visited[c] = true;
        }
        
        return sum;
    }
}