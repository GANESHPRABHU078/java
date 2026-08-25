class Solution {
    public int[] prevPermOpt1(int[] arr) {
        boolean f = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) f=false;
        }
        if(f) return arr;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                int j=arr.length-1;
                while(j>i&&arr[j]>=arr[i]) j--;
                while(j>i+1&&arr[j]==arr[j-1]) j--;
                int t = arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                return arr;
            }
        }
        return arr;
    }
}