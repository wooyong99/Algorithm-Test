import java.util.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        Date o1 = new Date(date1[0], date1[1], date1[2]);
        Date o2 = new Date(date2[0], date2[1], date2[2]);
        
        return o1.before(o2) ? 1 : 0;
    }
}