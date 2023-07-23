class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        switch(n){
            case 1:
                answer = new int[slicer[1]+1];
                for(int i = 0 ; i<=slicer[1]; i++){
                    answer[i] = num_list[i];
                }
                break;
            case 2:
                answer = new int[num_list.length-slicer[0]];
                int idx = 0;
                for(int i =slicer[0] ; i<num_list.length; i++){
                    answer[idx] = num_list[i];
                    idx++;
                }
                break;
            case 3:
                answer = new int[slicer[1] - slicer[0] +1 ];
                idx = 0;
                for(int i = slicer[0]; i<=slicer[1]; i++){
                    answer[idx]=num_list[i];
                    idx++;
                }
                break;
            case 4:
                answer = new int[(slicer[1] - slicer[0] +2) / 2];
                idx = 0;
                for(int i = slicer[0]; i <= slicer[1]; i+=slicer[2]){
                    answer[idx] = num_list[i];
                    idx++;
                }
                break;
        }
        
        
        return answer;
    }
}