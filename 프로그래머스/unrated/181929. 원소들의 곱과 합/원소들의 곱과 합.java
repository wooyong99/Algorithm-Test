class Solution {
    public int solution(int[] num_list) {
        int sum_multiple = 1;
        int sum = 0;
        for(int num : num_list){
            sum_multiple *= num;
            sum += num;
        }
        return sum_multiple < Math.pow(sum,2) ? 1:0;
    }
}