class Solution {
    public boolean exist(char[][] board, String word) {
        int n =board.length;
        int m  = board[0].length;
        boolean visit[][]= new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(backtracking(board,word,0,visit,i,j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    boolean backtracking(char[][] board, String word ,int start,boolean [][]visit,int i,int j){
        if(start==word.length()) return true;
        if(i<0||i>=board.length||j<0||j>=board[0].length||visit[i][j]||word.charAt(start)!=board[i][j]){
            return false;
        }
        visit[i][j]=true;
        if(backtracking(board,word,start+1,visit,i+1,j)||backtracking(board,word,start+1,visit,i-1,j)||backtracking(board,word,start+1,visit,i,j+1)||backtracking(board,word,start+1,visit,i,j-1)) {
            return true;
        }
        visit[i][j] = false;
        return false;
    }
}