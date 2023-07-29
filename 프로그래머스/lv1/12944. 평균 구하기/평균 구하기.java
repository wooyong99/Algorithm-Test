class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int i = 0 ; i<arr.length; i++){
            answer += arr[i];
        }
        
        double rs = answer / arr.length;
        return rs;
    }
}