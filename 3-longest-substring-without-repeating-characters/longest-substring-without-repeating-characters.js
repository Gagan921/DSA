/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
   let maxCount = 0;
    let obj = new Set();
   let j = 0;

   for( let i = 0;i<s.length;i++){
     while(obj.has(s[i])){
        obj.delete(s[j])
        j++;
     
     }
       obj.add(s[i]);
         maxCount = Math.max(maxCount, i-j+1);
   }
   return maxCount;
};