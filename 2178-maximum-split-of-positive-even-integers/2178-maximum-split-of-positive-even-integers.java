class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<List<Long>> res = new ArrayList<>();
        if(finalSum % 2 != 0){//2m+2n=2(m+n)
            return new ArrayList<>();
        }
        
        bt(finalSum, 2, new ArrayList<>(), res);

        return res.get(0);
    }
    
    private void bt(long finalSum, long start, List<Long> curComb, List<List<Long>> res){
        if(finalSum == 0){
            res.add(new ArrayList<>(curComb));
            return;
        }
        for(long i = start; i <= finalSum; i+=2){
            curComb.add(i);
            bt(finalSum - i, i + 2, curComb, res);
            if(res.size() > 0) return;
            curComb.remove(curComb.size()-1);
        }
    }
}