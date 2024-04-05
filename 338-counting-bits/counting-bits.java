class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i = 0;i<=n;i++){
            int count = 0;
            int k = i;
            while(k!=0){
                count+=k&1;
                k>>>=1;
            }
            arr[i]=count;
        }
        return arr;
    }
}