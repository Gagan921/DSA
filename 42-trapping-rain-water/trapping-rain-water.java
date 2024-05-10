class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0;
        int right = 1;
        int res = 0;
        int n = height.length;

        int [] Pmax = new int[n];
        Pmax[0] = height[0];
        int [] Smax = new int[n];
        Smax[n-1] = height[n-1];
        for(int i = 1;i<n;i++){
            Pmax[i] = Math.max(Pmax[i-1], height[i]);
        }
        for(int j = n-2;j>0;j--){
            Smax[j] = Math.max(Smax[j+1], height[j]);
        }
       for(int i = 0;i<n;i++){
        int maxH = Math.min(Pmax[i],Smax[i]);
        if(maxH>height[i]){
            res+=(maxH-height[i]);
        }
       }
        
        return res;
    }
}
