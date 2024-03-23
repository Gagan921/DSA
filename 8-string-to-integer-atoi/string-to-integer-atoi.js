/**
 * @param {string} s
 * @return {number}
 */
var myAtoi = function(s) {
    // let str = s.split("");
    // console.log(str);
    // let res = 0;
    // let MAX_VAL = Math.pow(2,31)-1
    // let MIN_VAL = Math.pow(-2,31);
    // let negative = 1;
    // let idx = -1;
    // for(let i = 0;i<str.length;i++){
    //     console.log(typeof Number(str[i]), str[i]);
    //     if(typeof Number(str[i]) === 'number' && Number(str[i])>=0 && str[i]!=' '){
    //         console.log("isme")
    //        res = res*10 +Number(str[i]);
    //     }else if(str[i]==='-'){
    //         negative=-1;
    //         res*=-1;

    //     }else if(str[i]!= ' '){
    //         ;
    //     }else{
    //         continue;
    //     }
        
    // }
    // res = res*negative;
    // if(res<0){
    //     res = Math.max(res, MIN_VAL)
    // }
    // res = Math.min(res,MAX_VAL)
    
    // return res;
    const ans = Number.parseInt(s);
    if(ans){
        if(ans<=-2147483648) return -2147483648
        else if(ans>=2147483647) return 2147483647;
        else return ans;
    }
    return 0;

};