class Solution {
    public int maxDigitRange(int[] nums) {
        int range =0;
        for(int i:nums){
            int max =0;
            int min=9;
            int n=i;
            while(n!=0){
                min=Math.min(min,n%10);
                max =Math.max(max,n%10);
                n/=10;
            }
            range=Math.max(range,max-min);
        }
        int sum =0;
        for(int i:nums){
            int max =0;
            int min=9;
            int n=i;
            while(n!=0){
                min=Math.min(min,n%10);
                max =Math.max(max,n%10);
                n/=10;
            }
            if(range==max-min){
                sum+=i;
             }
        }
        return sum;
    }
}