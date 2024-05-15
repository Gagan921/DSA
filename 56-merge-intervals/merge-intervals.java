class Solution {
    public int[][] merge(int[][] intervals) {
        int m = intervals.length;
        int n = intervals[0].length;
        if (intervals.length <= 1)
			return intervals;

        Arrays.sort(intervals,(a,b)-> a[0] - b[0]);
        int startTime = intervals[0][0];
        int endTime = intervals[0][1];  
        List<int[]> merged = new ArrayList<>();
        for(int i =1; i<intervals.length; i++){
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];
            if(currentStart<=endTime){
                endTime = Math.max(currentEnd,endTime);
            }else{
                merged.add(new int[]{startTime,endTime});
                endTime = currentEnd;
                startTime = currentStart;
            }
        }
        merged.add(new int[]{startTime,endTime});
        return merged.toArray(new int[merged.size()][]);
    }
}