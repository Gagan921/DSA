class Solution {
    public int[] plusOne(int[] digits) {
        int n  = digits.length-1;
        int carry = 0;
        for(int i = n; i>=0; i--){
            if(digits[i]==9){
                digits[i]=0;
                carry = 1;
            }else if((digits[i]!=9) && i == n){
                digits[i]+=1;
                carry=0;
                return digits;
            }else{
                digits[i]+=carry;
                carry = 0;
                return digits;  
            }
        }
        if(carry==1){
          int[] newArray = new int[digits.length + 1];
            for(int i  = 0;i<n+1;i++){
                if(i==0){
                    newArray[i]=1;
                }else{
                    newArray[i]=0;
                }
            }
            digits = newArray;
            return digits;
        }
        
        return digits;
    }
}