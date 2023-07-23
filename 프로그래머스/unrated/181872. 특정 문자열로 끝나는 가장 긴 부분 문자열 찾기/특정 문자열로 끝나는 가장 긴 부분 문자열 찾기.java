class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
//         Map<Integer, Integer> map = HashMap<>();
        
//         int idx = myString.indexOf(pat);
//         while(idx != -1){
//             map.put(idx, myString.subString())
//         }
        int idx = myString.lastIndexOf(pat);
        answer = myString.substring(0, idx+pat.length());
        
        
        return answer;
    }
}