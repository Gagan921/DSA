public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;   // make variable ans to store the final answer.
        for(int i=0;i<32;i++){   // Iterate the loop 1 to 31 times and in the loop make variable lsb as 0.
            int lsb = 0;
            if(((n>>i)&1)==1){   // go to the every bit and check ith bit in i is set or not if ith bit is set make first to ith bit set(1<<31-i) and store in to the lsb.
                lsb = 1<<31-i;
                ans = ans | lsb;   // every time time set lsb th bit into the ans using or(|) bitwise operator.
            }
        }
        return ans;///  return ans.
    }
}