class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1= new ArrayList<>();
        list1.add(1);
        list.add(list1);
        if(rowIndex==0){
            return list1;
        }
        for(int i=1;i<=rowIndex;i++){
            List<Integer> pre = list.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++){
                  curr.add(pre.get(j)+pre.get(j-1));
            }
            curr.add(1);
            list.add(curr);
        }
        return list.get(rowIndex);
    }
}