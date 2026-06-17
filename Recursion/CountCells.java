package Recursion;

public class CountCells {
    public static final int N = 8;
    public static int grid[][] = {
        {1,0,0,0,0,0,0,1},
        {0,1,1,0,0,1,0,0},
        {1,1,0,0,1,0,1,0},
        {0,0,0,0,0,1,0,0},
        {0,1,0,1,0,1,0,0},
        {0,1,0,1,0,1,0,0},
        {1,0,0,0,1,0,0,1},
        {0,1,1,0,0,1,1,1}
    };

    private static int BACKGROUND_COLOR = 0;
    private static int IMAGE_COLOR = 1;
    private static int ALREADY_COUNTED = 2;

    public int countCellsInBlob(int x, int y){
        if(x<0||y<0||x>=N||y>=N)
            return 0;
        else if(grid[x][y] != IMAGE_COLOR)
            return 0;
        else{
            grid[x][y] = ALREADY_COUNTED;
            return 1+ countCellsInBlob(x-1, y+1) + countCellsInBlob(x, y+1) + countCellsInBlob(x+1, y+1) 
            + countCellsInBlob(x-1, y) + countCellsInBlob(x+1, y)
            + countCellsInBlob(x-1, y-1) + countCellsInBlob(x, y-1) + countCellsInBlob(x+1, y-1);
        }
    }
    public static void printGrid(){
        for(int i =0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        CountCells cc = new CountCells();
        System.out.println("before counting");
        printGrid();

        System.out.println("blob size : " + cc.countCellsInBlob(3, 5));

        System.out.println("after counting");
        printGrid();
    }
}
