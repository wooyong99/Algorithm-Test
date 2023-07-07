class Solution {
    public int solution(String my_string, String is_suffix) {
        int rs = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.substring(i).equals(is_suffix)){
                rs = 1;
                break;
            }
        }
        return rs;
    }
}