package Recursion;

public class NQueens {
    private int n;
    private int[] board; // board[r] = c(r행 c열에 퀸이 있음)

    public NQueens(int n){
        this.n = n;
        this.board = new int[n];
    }

    private boolean queens(int level){
        if(level == n)
            return true;
        for(int i=0; i< n; i++){
            board[level] = i;
            if(promising(level) && queens(level+1))
                return true;
        }
        return false;
    }

    private boolean promising(int level){
        for(int i = 0; i<level; i++){
            if(board[i] == board[level])
                return false;
            else if(Math.abs(level-i) == Math.abs(board[level]-board[i]))
                return false;
        }
        return true;
    }

    public void solve(){
        if(queens(0)){
            for(int i = 0; i< n; i++){
                for(int j = 0; j<n; j++){
                    System.out.print(board[i] == j ? " Q " : " X ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("해를 찾을 수 없습니다.");
        }
    }

    public static void main(String[] args){

        NQueens nq = new NQueens(4);
        nq.solve();
    }
}



