class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i<myString.length(); i++){
            if(myString.charAt(i) == 'a'){
                answer += Character.toUpperCase(myString.charAt(i));
            }else if(Character.isUpperCase(myString.charAt(i)) && myString.charAt(i) != 'A'){
                answer += Character.toLowerCase(myString.charAt(i));
            }else{
                answer += myString.charAt(i);    
            }
        }
        
        return answer;
    }
}