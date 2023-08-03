class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                answer+=s.charAt(i);
                continue;
            }
            if(Character.isUpperCase(s.charAt(i))){
                if((int)'Z' <(int)s.charAt(i)+n){
                    int gap = (int)s.charAt(i)+n - (int)'Z';
                    answer += (char)('A'+gap-1);
                }else{
                    int sum = (int)s.charAt(i) + n;
                    answer += (char)sum;
                }
            }else{
                if((int)'z' < (int)s.charAt(i)+n){
                    int gap = (int)s.charAt(i) + n - (int)'z';
                    System.out.println(gap);
                    answer += (char)('a'+gap-1);
                }else{
                    int sum = (int)s.charAt(i) + n;
                    answer += (char)sum;
                }
            }
            int change = (int)s.charAt(i) + n;
    
        }
        
        return answer;
    }
}