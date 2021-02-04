import java.util.*;
class TicTacToe {

    /** Initialize your data structure here. */
    char[][] board;
    public TicTacToe(int n) {
        board = new char[n][n];
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        if(player == 1){
            board[row][col] = 'X'; 
        }else{
            board[row][col] = 'O'; 
        }
        char ply = player == 1? 'X':'O';
        //col
        int res = player;
        for(int i = 0; i < board.length;i++){
            if(board[row][i]!= ply){
                res = 0;
                
            }
        }
        if(res != 0){
            return res;
        }
        res = player;
        //row
        for(int i = 0; i < board.length;i++){
            if(board[i][col]!=ply){
                res= 0;
            }
        }
        if(res != 0){
            return res;
        }
         res = player;
        //diag Left
        for(int i = 0; i < board.length;i++){
            if(board[i][i]!=ply){
                res= 0;
            }
        }
        if(res != 0){
            return res;
        }
        res = player;
        //diag Right
        int j = 0;
        for(int i = board.length-1; i >= 0;i--){
            if(board[j][i]!=ply){
                res= 0;
            }
            j++;
            
        }
        if(res != 0){
            return res;
        }
        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        // System.out.println(Arrays.toString(board[2]));
        System.out.println();
        return 0;
        
    }
}
