class Solution {
    public int smallestNumber(int n, int t) {
        if(t==1) return n;
        for(int i=n;i<=100;i++){
            int l=i;
           int p=1;
           while(l>0){
             p=p*(l%10);
             l=l/10;
           }
           if(p%t==0) return i;
        }
        return 0;
    }
}