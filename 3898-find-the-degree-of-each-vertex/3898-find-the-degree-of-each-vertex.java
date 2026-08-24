class Solution {
    public int[] findDegrees(int[][] matrix) {
        int []arr = new int[matrix.length];
        int j=0;
        for(int []fre:matrix){
            for(int i:fre){
                arr[j]+=i;
            }
            j++;
        }
        return arr;
    }
}