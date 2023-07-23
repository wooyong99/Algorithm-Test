class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] answer= null;
        for(int i = 0; i < 11; i++){
            if(Math.pow(2,i) >= arr.length){
                answer = new int[(int)Math.pow(2,i)];
                break;
            }
        }
        
        for(int i = 0 ; i<arr.length; i++){
            answer[i] = arr[i];
        }
        
        
        return answer;
    }
}