class Solution {
    public int countAsterisks(String s) {
        boolean t =false;
        int co=0;
        for(char c : s.toCharArray()){
            if(c=='|') t=!t;
            if(!t){
                if(c=='*') co++;
            }
        }
         return co;
    }
}