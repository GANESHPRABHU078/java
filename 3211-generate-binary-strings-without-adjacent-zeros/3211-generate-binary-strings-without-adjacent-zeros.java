class Solution {
    List<String> list = new ArrayList<>();
    public List<String> validStrings(int n) {
        backtracking(n,new StringBuilder());
        return list;
    }
     void backtracking(int n,StringBuilder sb){
        if(sb.length()==n){
            list.add(sb.toString());
            return;
        }
        sb.append('1');
        backtracking(n,sb);
        sb.deleteCharAt(sb.length()-1);
        if(sb.length()==0||sb.charAt(sb.length()-1)=='1'){
             sb.append('0');
        backtracking(n,sb);
        sb.deleteCharAt(sb.length()-1);
        }

     }
}