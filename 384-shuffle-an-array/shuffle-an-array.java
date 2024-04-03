class Solution {
    int[] arr;
    List<Integer> al;
    public Solution(int[] nums) {
        arr = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        al = Arrays.stream(nums).boxed().collect(Collectors.toList());

    }
    
    public int[] reset() {
        return arr;
    }
    
    public int[] shuffle() {
        Collections.shuffle(al);
        return al.stream().mapToInt(Integer::intValue).toArray();

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */