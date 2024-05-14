class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // 1. initialize aaray
        // 2. find length of strings
        // 3. initailize hashmap and count for p
        // 4. use second for loop run till final length - length of p
        // 5. now use internal loop to copmare the current element
        // HashMap<Character,Integer> a1 = new HashMap<>();
        // HashMap<Character,Integer> a2  = new HashMap<>();
        // ArrayList<Integer> hp = new ArrayList<>();
        // int [] result = {-1,-1};
        // int m = s.length();
        // int k  = p.length();
        // for(int i =0;i<k;i++){
        //     char c = p.charAt(i);
        //     a2.put(c, a2.getOrDefault(c, 0)+1);
        // }
        // for(int i =0;i<m;i++){
        //     char d  = s.charAt(i);
        //     if(a1.equals(a2)){
        //         hp.add(i-k);
        //     }
        //     a1.put(d, a1.getOrDefault(d, 0)+1);
        // }

        
        // System.out.println(a2 +"r"+ a1);
        // return hp;
        List list = new ArrayList<>();


            if (s == null || p == null || s.length() < p.length())
    { 
        return list;
    }
    
    //Record char freq
    int[] freq = new int[26];
    
    for (char c : p.toCharArray()) 
    {
        freq[c - 'a']++;
    }

    //Window, charsleft, windowsize
    int left = 0;
    int right = 0;
    int charsleft = p.length();
    int windowsize = p.length() - 1; //-1 for inclusive arithmetic i.e. length of [1, 3] is 3, but 3 - 1 = 2.
    int strlen = s.length();
    
    //test "bbbaebbbacbacd" with "abc"
    while (right < strlen) 
    {

        //Required character found
        if (freq[s.charAt(right) - 'a'] > 0)
        {
            charsleft--;

            if (charsleft == 0)
            {
                //Anagram found
                list.add(left);
            }
        }

        //Update character frequency
        freq[s.charAt(right) - 'a']--;
        
        //If right - left = windowsize, slide left side +1, because we will be sliding right +1 either way
        //If the left character that is being slid away from is needed to satisfy the anagram we have to inc. charsleft++
        //we check that this left character was required using freq[s.charAt(left) - 'a'] >= 0
        //In short: Slide window / Update charsleft and restore char frequency
        if (right - left == windowsize)
        {
            if (freq[s.charAt(left) - 'a'] >= 0)
            {
                //if freq[s.charAt(left) - 'a'] >= 0 that means the left character was required so charsleft++
                charsleft++;
            }
            else
            {
            }

            freq[s.charAt(left) - 'a']++;
            left++;
            right++;

            if (right + 1 < strlen)
            {
            }

        }
        else
        {
            right++;
        }

    }

    return list;

    }
}