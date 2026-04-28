// package 2D Matrix;

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]){
        int stRow = 0;
        int stCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        
        while (stRow <= endRow && stCol <= endCol) {
                // Top
            for(int j = stCol; j < endCol; j++){
                System.out.print(matrix[stRow] [j] + " ");
            }

            // Right
            for(int i = stRow + 1; i <= endRow; i++){
                System.out.print(matrix[i] [endCol] + " ");
            }

            // Bottom
            for(int j = endCol - 1; j >= stCol; j--){
                if(stCol == endCol){
                    break ;
                }
                System.out.print(matrix[endRow] [j] + " ");
            }

            // Left
            for(int i = endRow - 1; i >= stRow + 1; i-- ){
                if(stRow == endRow){
                    break ;
                }
                System.out.print(matrix[i] [stCol] + " ");
            }

            stRow++;
            stCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};

        printSpiral(matrix);
    }
}
