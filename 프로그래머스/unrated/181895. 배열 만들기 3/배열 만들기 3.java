class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int idx = (intervals[0][1] - intervals[0][0]) + (intervals[1][1] - intervals[1][0]) +2;
        int[] answer = new int[idx];
        int rs_idx = 0;
        for(int i = 0; i<intervals.length; i++){
            for(int j = intervals[i][0]; j<=intervals[i][1]; j++){
                answer[rs_idx] = arr[j];
                rs_idx++;
            }
        }
        
        
        return answer;
    }
}