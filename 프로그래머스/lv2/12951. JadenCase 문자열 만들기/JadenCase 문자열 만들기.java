import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ",-1);
        String rs = "";
        for(String str : arr){
            if(str.equals("")){
                rs+=" ";
            }else{
                rs+= Character.toUpperCase(str.charAt(0))+str.substring(1).toLowerCase()+" ";
            }
        }
        return rs.substring(0,rs.length()-1);
    }
}