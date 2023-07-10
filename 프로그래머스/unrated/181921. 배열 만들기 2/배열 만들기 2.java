import java.util.stream.IntStream;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = IntStream.rangeClosed(l,r)
                .mapToObj(e->String.valueOf(e))
                .filter(e -> {
                    int len_5 = e.replaceAll("[50]","").length();
                    if(len_5 == 0){
                        return true;
                    }else{
                        return false;
                    }
                })
                
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}