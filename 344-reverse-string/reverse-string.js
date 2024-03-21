/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverseString = function(s) {
    let j = 0;
    const size = s.length-1;
    for(let i = size;i>=size/2;i--){
        let tmp  = s[i];
        s[i] = s[j]
        s[j] = tmp
        j++;
    }
};