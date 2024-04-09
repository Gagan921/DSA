/**
 * @param {number} n
 * @return {string}
 */
var countAndSay = function(n) {
    var res = "1";
    for(let j = 1;j<n;j++){
        let arr = res.split('');
        res ="";
        let c =1;
        for(let i =0;i<arr.length;i++){
        console.log(arr[i])
        if(arr[i]==arr[i+1]){
            c++;
        }else{
            res+=c+arr[i];
            c=1;
        }
    }
    
    }
    
        return res;
    
};