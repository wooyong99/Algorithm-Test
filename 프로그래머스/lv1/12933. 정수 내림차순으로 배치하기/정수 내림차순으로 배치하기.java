import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr);
        StringBuilder str2 = new StringBuilder();
        for(int i = 0; i<arr.length; i++){
            str2.append(arr[i]);
        }
        
        str2.reverse();
        
        answer = Long.parseLong(str2.toString());
        
        return answer;
    }
}