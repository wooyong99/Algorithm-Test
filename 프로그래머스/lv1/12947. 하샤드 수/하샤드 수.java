class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = String.valueOf(x);
        int sum = 0;
        
        for(int i = 0; i<str.length(); i++){
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        
        if(x % sum !=0){
            answer = false;
        }
        System.out.println(sum);
        return answer;
    }
}