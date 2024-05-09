class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n  = matrix[0].length;
        int count = 0;
        int left = 0;
        int right = n-1;
        int top =0;
        int bottom = m-1;
        //int [] result = new int [m*n];
        List<Integer> result = new LinkedList<>();
        while(count<m*n){
           for(int i=left; i<=right && count<m*n;i++){
            result.add(matrix[top][i]);
            count++;
           }
           top++;
           for(int i=top; i<=bottom && count<m*n;i++){
            result.add(matrix[i][right]);
            count++;
           }
           right--;
           for(int i=right; i>=left && count<m*n;i--){
            result.add(matrix[bottom][i]);
            count++;
           }
           bottom--;
          for(int i=bottom; i>=top && count<m*n;i--){
            result.add(matrix[i][left]);
            count++;
           }
           left++;

        }
        return result;
    }
}