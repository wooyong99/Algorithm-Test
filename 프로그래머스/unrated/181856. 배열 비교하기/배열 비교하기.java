class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int[] sum = new int[2];
        if(arr1.length != arr2.length){
            answer = arr1.length > arr2.length ? 1 : -1;
        }else{
            for(int i = 0; i<arr1.length; i++){
                sum[0] += arr1[i];
            }
            for(int i = 0; i<arr2.length; i++){
                sum[1] += arr2[i];
            }
        }
        
        if(sum[0] > sum[1]){
            answer = 1;
        }else if (sum[1] > sum[0]){
            answer = -1;
        }
        
        return answer;
    }
}