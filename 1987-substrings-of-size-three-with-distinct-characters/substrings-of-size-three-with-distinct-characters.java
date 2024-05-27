class Solution {
    public int countGoodSubstrings(String p) {
        int res=0;
        char [] s = p.toCharArray();
        for(int i =1;i<s.length-1;i++){
          if(s[i]!=s[i-1] && s[i]!=s[i+1] && s[i-1]!=s[i+1]) res++;
        }

        return res;
    }
}