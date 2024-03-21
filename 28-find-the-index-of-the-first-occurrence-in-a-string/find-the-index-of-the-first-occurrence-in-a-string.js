/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    let count = 0;
    let currentIndex = -1; 
    if (needle.length > haystack.length) {
        return -1;
    }
    for (let i = 0; i <= haystack.length - needle.length; i++) { 
        let j = 0;
        while (j < needle.length && haystack[i + j] === needle[j]) {
            count++;
            j++;
        }
        if (count === needle.length) {
            currentIndex = i;
            return currentIndex;
        }
        count = 0;
    }
    return currentIndex;
};
