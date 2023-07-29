class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for(int i = 0 ;i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            String e1 = answer.substring(0,start);
            StringBuilder e2 = new StringBuilder(answer.substring(start,end+1));
            String e3 = answer.substring(end+1);
            answer = new StringBuilder(e1+e2.reverse()+e3);
        }
        
        return answer.toString();
    }
}