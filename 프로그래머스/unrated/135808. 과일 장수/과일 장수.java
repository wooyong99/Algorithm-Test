import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[][] box_arr = new int[score.length/m][m];
        
        LinkedList<Integer> list = new LinkedList<>(Arrays.stream(score).boxed().collect(Collectors.toList()));
        Collections.sort(list, Collections.reverseOrder());
        Queue<Integer> que = list;
        
        
        for(int i = 0 ; i< box_arr.length; i++){
            for(int j = 0; j<m; j++){
                box_arr[i][j] = que.poll();
            }
        }

        for(int[] arr : box_arr){
            answer += (arr[m-1] * m);
        }
        
        return answer;
    }
}