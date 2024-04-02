/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function(n) {
    let ans  = [];
    for( let num = 1; num<=n;num++){
        if(num%3==0 && num%5==0){
           ans.push("FizzBuzz");
        }else if(num%3==0){
            ans.push("Fizz");
        }else if(num%5==0){
            ans.push("Buzz");
        }else{
            ans.push(`${num}`);
        }
    }
    return ans;
    
};