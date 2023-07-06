class Solution {
    public int solution(int a, int b) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        str1.append(String.valueOf(a)+String.valueOf(b));
        str2.append(String.valueOf(b)+String.valueOf(a));
        int num1= Integer.parseInt(str1.toString());
        int num2= Integer.parseInt(str2.toString());
        int answer = (num1 > num2 ? num1 : num2);
        return answer;
    }
}