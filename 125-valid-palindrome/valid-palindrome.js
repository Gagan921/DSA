/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let s1 = ""
    let s2 = ""
    for(i in s){
        let c = s.charCodeAt(i);
        if((c>=48 && c<=57)|| (c>=97 && c<=122) || (c>=65 && c<=90)){
            s1+= String.fromCharCode(c);
        }  
    }
    console.log(s1);
    return s1.toLowerCase()=== s1.toLowerCase().split("").reverse().join("")
    }