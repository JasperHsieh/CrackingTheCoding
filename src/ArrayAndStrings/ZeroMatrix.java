import java.util.*;

public class ZeroMatrix {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        int[][] m = new int[][]{
            {0,1,2,3,4},
            {1,1,2,3,5},
            {1,1,2,0,4},
            {0,1,2,8,4},
        };
        printMatrix(m);
        setZeros(m);
        System.out.println();
        printMatrix(m);
    }
   
    static void printMatrix(int[][] m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    static class Pair{
        public int x = 0;
        public int y = 0;
        Pair(int i, int j){
            x = i;
            y = j;
        }
    }
    
    static void setZeros(int[][] matrix){
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        ArrayList<Pair> list = new ArrayList<Pair>();
        for(int i=0; i<rowCount; i++){
            for(int j=0; j<columnCount; j++){
                if(matrix[i][j] == 0){
                    Pair p = new Pair(i, j);
                    list.add(p);
                }
            }
        }

        for(Pair p: list){
            nullifyRow(matrix, p.x);
            nullifyCol(matrix, p.y);
        }
    }
    
    static void nullifyRow(int[][] m, int row){
        for(int j=0; j<m[0].length; j++ ){
            m[row][j] = 0;
        }
    }
    static void nullifyCol(int[][] m, int col){
        for(int j=0; j<m.length; j++ ){
            m[j][col] = 0;
        }
    }
}
