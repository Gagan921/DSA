class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> hmap = new HashMap<>();
        for(String str: strs) {
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sortedStr = String.valueOf(strArr);
            if(!hmap.containsKey(sortedStr)) {
                hmap.put(sortedStr,new ArrayList<String>());
            }
            hmap.get(sortedStr).add(str);
        }
        for(List<String> list: hmap.values()) {
            res.add(list);
        }
        return res;
    }
}