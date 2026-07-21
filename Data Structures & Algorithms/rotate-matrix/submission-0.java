class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;

       // transpose
       for(int i=0; i<r; i++){
        for(int j=0; j<i; j++){
            matrix[i][j] = matrix[i][j] ^ matrix[j][i];
            matrix[j][i] = matrix[i][j] ^ matrix[j][i];
            matrix[i][j] = matrix[i][j] ^ matrix[j][i]; 
        }
       }

       // a b
       // a = a^b
       // b = a ^ b
       // a = a ^ b

       for(int i=0; i<r; i++){
        for(int j=0; j< c/2; j++){
            matrix[i][j] = matrix[i][j] ^ matrix[i][c-j-1];
            matrix[i][c-j-1] = matrix[i][j] ^ matrix[i][c-j-1];
            matrix[i][j] = matrix[i][j] ^ matrix[i][c-j-1];
        }
       }
    }
}
