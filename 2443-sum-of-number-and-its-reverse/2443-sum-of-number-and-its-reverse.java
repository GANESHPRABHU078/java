class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;
        for(int i=0;i<num;i++){
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            sb.reverse();
            int n = Integer.parseInt(sb.toString());
            if(i+n==num) return true;
        }
        return false;
    }
}