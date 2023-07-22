import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public static int[] solution(int[] answers) {
    int [] p1 = {1,2,3,4,5};
    int [] p2 = {2,1,2,3,2,4,2,5};
    int [] p3 = {3,3,1,1,2,2,4,4,5,5};
    int [] cnt = new int[3];
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < answers.length; i++){
        if(answers[i] == p1[i%5]){
            cnt[0]++;
        }
        if(answers[i] == p2[i%8]){
            cnt[1]++;
        }
        if(answers[i] == p3[i%10]){
            cnt[2]++;
        }
    }
    int max = Arrays.stream(cnt).max().getAsInt();
    for(int i = 0; i< cnt.length; i++){
        if(max == cnt[i]){
            list.add(i+1);
        }
    }
    return list.stream().mapToInt(e->(int)e).toArray();
  }
}