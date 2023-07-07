class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder("");
        int mode = 0;
        for(int i = 0; i<code.length(); i++){
            if(mode == 0){
                if(code.charAt(i) != '1'){
                    if(i % 2 == 0){
                        ret.append(code.charAt(i));
                    }
                }else{
                    mode = 1;
                }
            }else{
                if(code.charAt(i) != '1'){
                    if(i % 2 != 0){
                        ret.append(code.charAt(i));
                    }
                }else{
                    mode = 0;
                }
            }
        }
        return ret.toString().equals("") ? "EMPTY" : ret.toString();
    }
}