/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    let obj1=new Map();
    let obj2 =new Map();
     for(let i = 0;i<s.length;i++){
        const char = s[i];
        obj1.set(char, (obj1.get(char) || 0) + 1);
     }
     for(let i = 0;i<t.length;i++){
        const char = t[i];
        obj2.set(char, (obj2.get(char) || 0) + 1);
     }
     
return  _.isEqual(obj1, obj2) 

};