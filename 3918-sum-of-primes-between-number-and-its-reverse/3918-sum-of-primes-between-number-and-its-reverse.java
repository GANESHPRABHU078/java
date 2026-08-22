class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = 0;
        int t =n;
        while(n!=0){
            int r = n%10;
            rev = rev*10+r;
            n/=10;
        }
        int sum =0;
        if(t>rev){
            int tem =t;
              t=rev;
            rev = tem;
        }
        for(int i = t;i<=rev;i++){
            if(i==1) continue;
            boolean p = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    p = false;
                    break;
                }
            }
            if(p){
          // System.out.print(i+" ");
            sum+=i;
            }
        }
        return sum;
    }
}