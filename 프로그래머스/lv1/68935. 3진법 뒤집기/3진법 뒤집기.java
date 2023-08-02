class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder str = new StringBuilder("");
        while ( n/3 != 0){
            String temp = String.valueOf(n%3);
            str.insert(0,temp);
            n = n / 3;
        }
        str.insert(0,n);
        str.reverse();        
        int pow = 0;
        int sum = 0;
        for(int i = str.length()-1; i>=0 ; i--){
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += (num * (int)Math.pow(3,pow));
            pow++;
        }
        return sum;
    }
}