class Solution {
    public int solution(int a, int b) {
        StringBuilder str = new StringBuilder();
        str.append(String.valueOf(a) + String.valueOf(b));
        int ab = Integer.parseInt(str.toString());
        return  ab > 2*a*b ? ab : 2*a*b;
    }
}