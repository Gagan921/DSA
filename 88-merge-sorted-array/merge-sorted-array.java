class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       if(nums2.length!=0 && nums1.length==0) nums1 = nums2;
        int k = m-1;
        int j = n-1;
        int l = m+n-1;
        while(j>=0){
            if(k>=0 && nums1[k]>nums2[j]){
                nums1[l] = nums1[k];
                l--;
                k--;
            }else{
                nums1[l] = nums2[j];
                j--;
                l--;
            }
            
        
        }
    }
}