package AdvancedArrayManipulation;

public class SumOfMatrix {
    public static void main(String[] args) {
        int [][] matrix1 = {{1,2,3},{4,5,6}};
        int [][] matrix2 = {{2,3,4},{8,7,6}};

        int rows = matrix1.length;

        int cols = matrix1[0].length;

        int [][] sum = new int[rows][cols];

        for(int i =0; i<rows ; i++){
            for(int j =0 ; j<cols ; j++){
                 sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int [] row : sum){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
