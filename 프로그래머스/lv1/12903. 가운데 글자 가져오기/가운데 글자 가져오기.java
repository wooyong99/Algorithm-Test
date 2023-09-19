class Solution {
    public String solution(String s) {
        String word = "";
        int len = s.length();
        if(len % 2 == 0){
            word = s.substring((len/2)-1,(len/2)+1);
        }else{
            word = String.valueOf(s.charAt(len/2));
        }
        return word;
    }
}