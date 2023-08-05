import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer = new int[s.length()];
        
        for(int i = 0; i<s.length(); i++){
            if(s.indexOf(s.charAt(i)) == s.indexOf(s.charAt(i),i) | s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                answer[i] = -1;
            }else{
                int bg = 0;
                int sm = 0;
                for(int j = i-1 ; j>=0; j--){
                    if(s.charAt(i) == s.charAt(j)){
                        answer[i] = i-j;
                        break;
                    }
                }
                // for(int j = i+1 ; j<s.length()-1; j++){
                //     if(s.charAt(i) == s.charAt(j)){
                //         bg = j-i;
                //     }
                // }
                // if(bg < sm ){
                //     answer[i] = sm-bg;
                // }else{
                //     answer[i] = bg-sm;
                // }
            }
        }
        return answer;
    }
}