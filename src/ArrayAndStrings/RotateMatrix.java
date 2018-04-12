public class RotateMatrix {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        int[][] m = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] m2 = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        printArray(m2);
        System.out.println(rotate(m2));
        printArray(m2);
    }

    static boolean rotate(int[][] matrix){
        
        if(matrix.length == 0 || matrix.length != matrix[0].length)return false;

        int tmp = 0;
        int layer = 0;
        int offset = matrix.length-1;
        for(int i=0; i<matrix.length/2; i++){
            for(int j=offset-i; j>=i; j--){
                tmp = matrix[offset-j][i]; // save top
                matrix[offset-j][i] = matrix[i][j]; // left to top
                matrix[i][j] = matrix[j][offset-i]; // bottom to left
                matrix[j][offset-i] = matrix[offset-i][offset-j]; //right to bottom
                matrix[offset-i][offset-j] = tmp; //top to right
            }
        }
        return true;
    }

    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.printf("%5d ", arr[i][j]);
            }
            System.out.println();
        }
    }

}
