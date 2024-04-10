/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    var maxLength = 0;
    var res = "";
    if(s.length<=1){
        return s;
    }
    for(let i = 0;i<s.length;i++){
       let left = i;
       let right = i;
       var  even = checkPailendrome(s,left, right, res, maxLength)
       var  odd = checkPailendrome(s,left, i+1,res, maxLength)

       if(even.length>odd.length && even.length>res.length){
        res=even;
    }else if(odd.length>even.length && odd.length>res.length){
        res=odd;
    }
    }
    
    return res;
};
function checkPailendrome(str, left, right,res, maxLength){
 while(left>=0 && right<=str.length-1 && str[left]==str[right]){
    if((right-left+1)>maxLength){
       maxLength = right-left-1;
       res = str.substring(left, right+1)
    }
    left--;
    right++;
 }
console.log(maxLength)
 return res;
}