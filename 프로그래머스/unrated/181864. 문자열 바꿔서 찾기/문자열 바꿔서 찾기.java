class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String change = "";
        for(int i = 0; i<myString.length(); i++){
            if(myString.charAt(i) == 'A'){
                change += "B";
            }else{
                change+="A";
            }
        }
        if(change.contains(pat)){
            answer = 1;
        }
        
        return answer;
    }
}