import java.util.*;

class Solution {
    public String solution(String s) {
        
        String answer = s;
        
        String[] arr = answer.split(" ",-1);
        for(int k = 0; k<arr.length; k++){
            String str = arr[k];
            System.out.println(str.length());
            str = str.trim();
            String change = "";
            for(int a = 0; a<str.length(); a++){
                if(a % 2!=0){
                    change+=Character.toLowerCase(str.charAt(a));
                }else{
                    change+=Character.toUpperCase(str.charAt(a));
                }
            }
            arr[k] = change.toString();
        }
        answer = String.join(" ",arr);
        return answer;
    }
}