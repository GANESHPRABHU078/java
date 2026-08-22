class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0 ;
        int pro=1;
        int y = n;
        while(y!=0){
            pro *= y%10;
            sum += y%10;
            y/=10;
        }
        sum+=pro;
        return n%sum==0;
    }
}