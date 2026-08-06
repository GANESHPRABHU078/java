class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i:nums){
            int l=i;
            while(l>0){
                if(digit==(l%10)) count++;
                l/=10;
            }
        }
        return count;
    }
}