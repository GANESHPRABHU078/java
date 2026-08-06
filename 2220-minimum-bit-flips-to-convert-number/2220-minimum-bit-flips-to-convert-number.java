class Solution {
    public int minBitFlips(int start, int goal) {
       StringBuilder s =new StringBuilder();
       StringBuilder v =new StringBuilder();
       while(start>0||goal>0){
        s.append(start%2);
        start/=2;
        v.append(goal%2);
        goal/=2;
       }
       int count=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=v.charAt(i)) count++;
       }
       return count;
    }
}