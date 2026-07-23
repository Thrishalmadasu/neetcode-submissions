class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length, c = matrix[0].length;
        int i=0, j=matrix[0].length-1;
        while(i<r && j>=0){
            int curr = matrix[i][j];
            if(curr == target) return true;

            if(curr > target) j--;
            else i++;
        }
        return false;
    }
}
