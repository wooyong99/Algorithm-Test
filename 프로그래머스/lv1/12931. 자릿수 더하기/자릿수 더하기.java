import java.util.*;

public class Solution {
    public int solution(int n) {
        String str_n = String.valueOf(n);
        int sum = 0;
        for(int i = 0; i<str_n.length(); i++){
            String num = String.valueOf(str_n.charAt(i));
            sum += Integer.parseInt(num);
        }
        
        return sum;
    }
}