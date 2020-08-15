class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        int result = 0;
        
        List<Integer> noDapIndexs = new  ArrayList<>();
        
        int i = 0;
        for(int[] interval : intervals){
            if(noDapIndexs.size() == 0){
                noDapIndexs.add(i);
                continue;
            }
            boolean isDap = false;
            for(int noDapIndex : noDapIndexs){
                if(intervals[noDapIndex][0] == interval[0] ||
                    intervals[noDapIndex][1] == interval[1]){
                    result++;
                    isDap = true;
                    break;
                }
            }
            if(!isDap) noDapIndexs.add(i);
            
            i++;
        }
        return result;
    }
}