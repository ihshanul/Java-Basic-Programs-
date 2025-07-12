package AdvancedArrayManipulation;

public class TransposeMatirc {
        public static void main (String [] args)
        {
            int [][] matrix = {
                {2,3},
                {5,6},
                {7,8}
            };

            int rows = matrix.length;
            int cols = matrix[0].length;

            int [][] transpose = new int[cols][rows];
            for(int i =0 ; i< rows ; i++){
                for(int j =0; j< cols ; j++){
                    transpose[j][i] = matrix[i][j];
                }
            }

            for(int i = 0; i<cols ; i++){
                for(int j =0 ; j<rows ; j++ ){
                    System.out.print(transpose[i][j]+" ");
                }
                System.out.println();
            }
        }
}
