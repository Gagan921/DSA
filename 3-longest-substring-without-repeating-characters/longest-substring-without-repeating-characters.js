/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let st = new Set();
    let ans=0;
    let left = 0;
    let right = 0;
    // for(let i = 0;i<s.length;i++){
    //     let c  = s.charAt(i);
    //     if(!st.has(c)){
    //         st.add(c);
    //         ans = Math.max(i-left+1, ans);
    //     }else if(st.has(c)){
    //         st.delete(s.charAt(left))
    //         left++;
    //     }
    // }
    // return s.length==0?0:ans;
    for(let i = 0; i < s.length; i++){
        let c = s.charAt(i);
        while (st.has(c)) {
            st.delete(s.charAt(left));
            left++;
        }
        st.add(c);
        ans = Math.max(ans, i - left + 1);
    }
    return ans;

};