/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    const n  = height.length;
    let maxNum =Number.max_value;
    let res = -1;
    let low = 0;
    let high = n-1;
    while(low<high){
        if(height[low]<=height[high]){
            res = Math.max(res, (high-low)*height[low])
            low++;
        }else{
            res = Math.max(res, (high-low)*height[high])
            high--;
        }
    }
   
    return res;
};