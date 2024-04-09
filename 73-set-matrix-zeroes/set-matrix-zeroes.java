class Solution {
    public void setZeroes(int[][] matrix) {
        int [] arrX = new int[matrix.length];
        int [] arrY = new int[matrix[0].length];
        Arrays.fill(arrX, 1);
        Arrays.fill(arrY, 1);
        int m = matrix.length-1;
        int n  = matrix[0].length-1;
        for(int i = 0;i<=m ;i++){
          for(int j = 0;j<=n; j++){
            if(matrix[i][j]==0){
                arrX[i] = 0;
                arrY[j] = 0;
            }
        }
        }
       for(int i = 0;i<arrX.length ;i++){
        if(arrX[i]==0){
            int j = 0;
            while(j<=n){
                matrix[i][j]=0;
                j++;
            }
        }
       }

        for(int j = 0;j<arrY.length ;j++){
        if(arrY[j]==0){
            int i = 0;
            while(i<=m){
                matrix[i][j]=0;
                i++;
            }
        }
        }
         
    }
}