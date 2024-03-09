/**
 * @param {string} s
 * @param {string} p
 * @return {number[]}
 */
var findAnagrams = function(s, p) {
    let s1 = Array(26).fill(0)
    let s2 = Array(26).fill(0)
    const result = [];
    if(p.length>s.length) return [];
    for(let i = 0;i<p.length;i++){
        s1[p.charCodeAt(i)-'a'.charCodeAt(0)]++;
        s2[s.charCodeAt(i)-'a'.charCodeAt(0)]++;
        //console.log(s2[i],s1[i]);
    }
    console.log(s2);
    for(let j = p.length;j<s.length;j++){
        if(isMatch(s1,s2) == true){
            result.push(j-p.length);
        }
        s2[s.charCodeAt(j)-'a'.charCodeAt(0)]++;
        s2[s.charCodeAt(j-p.length)-'a'.charCodeAt(0)]--;
    }
     if(isMatch(s1,s2) == true){
            result.push(s.length-p.length);
        } 
    function isMatch(s3,s4){
        for(let i = 0;i<26;i++){
            if(s3[i]!=s4[i]){
                return false
            }
        }
        return true;
    }
    return result;
};
