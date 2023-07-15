class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for(int i = 0; i<strings.length-1; i++){
            for(int j = i+1; j<strings.length; j++){
                if(func1(strings[i], strings[j], n) == 1){
                    System.out.println(strings[i].charAt(n));
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }else{
                    continue;
                }
            }
        }
        
        return strings;
    }
    public static int func1(String str1, String str2, int n){
        if(str1.charAt(n) < str2.charAt(n)){
            return 0;
        }else if(str1.charAt(n) == str2.charAt(n)){
            if(str1.compareTo(str2) <= 0){
                return 0;                              
            }else{
                return 1;
            }
        }else{
            return 1;
        }
    }
}