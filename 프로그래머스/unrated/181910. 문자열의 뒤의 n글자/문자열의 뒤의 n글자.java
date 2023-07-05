class Solution {
    public String solution(String my_string, int n) {
        StringBuilder str = new StringBuilder(my_string);
        int length = my_string.length();
        return str.substring(length-n, length);
    }
}