class Solution {
    public int hammingDistance(int x, int y) {
        int ans =0;
       StringBuilder sb = new StringBuilder();
       StringBuilder sb1 = new StringBuilder();
        while(x>0||y>0){
            sb.append(x%2);
            x /=2;
            sb1.append(y%2);
            y /=2;
        }
        String s =sb.reverse().toString();
        String v =sb1.reverse().toString();
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=v.charAt(i)) ans++;
         }
         return ans;
    }
}