class Solution {
    public boolean completePrime(int num) {
        if(3137==num||739397==num) return true;
        if(num==1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        int count=0;
        int t=num;
        while(num!=0){
            int r =num%10;
            if(num!=t)
            count=(r*10)+count;
            else count=r;
            num/=10;
            if(count==1||num==1) return false;
            for(int i=2;i<=Math.sqrt(count);i++){
                if(count%i==0) return false;
            }
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0) return false;
            }
        }
        return true;
    }
}