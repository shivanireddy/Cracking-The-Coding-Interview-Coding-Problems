/**
 * Problem Statement :
 * 
 * Write an algorithm such that if an element in an
 * M X N matrix is 0, it's entire row and column are
 * set to 0.
 * 
 * Time Complexity : O(M*N)
 * Space Complexity : O(1)
 *
 */
 
 class Problem_08 {
    public void setZeroes(int[][] matrix) {
        boolean isCol = false;
        int R = matrix.length;
        int C = matrix[0].length;
        for(int i=0;i<R;i++){
            if(matrix[i][0]==0) isCol=true;
            for(int j=1;j<C;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<R;i++){
            for(int j=1;j<C;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<C;j++){
                matrix[0][j]=0;
            }
        }
        if(isCol){
            for(int i=0;i<R;i++){
                matrix[i][0]=0;
            }
        }
    }
}
 
 