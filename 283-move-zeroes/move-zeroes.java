class Solution {
    public void moveZeroes(int[] arr) {
        int n  = arr.length;
         int count =0;
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
         for(int i =count;i<n;i++){
                arr[i] = 0;
            
        }
    }
}