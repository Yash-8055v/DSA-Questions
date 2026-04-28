public class DiagonalSum {
    public static void printDiagonalSum(int matrix[][]){
        int sum = 0;
        // for(int i = 0; i < matrix.length; i++){  TC = O(n^2) 
        //     for(int j = 0; j < matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i + j == matrix.length - 1){
        //              sum += matrix[i][j];
        //         }
        //     }
        // }

        //  For better optimize
        for(int i = 0; i < matrix.length; i++){
            //  PD
            sum += matrix[i][i];

            //  SD
            if(i != matrix.length - 1 - i){
                sum += matrix[i] [matrix.length - 1 - i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        printDiagonalSum(matrix);
    }
}
