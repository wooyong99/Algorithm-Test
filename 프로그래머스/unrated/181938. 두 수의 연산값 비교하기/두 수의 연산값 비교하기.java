class Solution {
    public int solution(int a, int b) {
        String str = String.valueOf(a)+String.valueOf(b);
        return Math.max(Integer.parseInt(str), 2*a*b);
    }
}