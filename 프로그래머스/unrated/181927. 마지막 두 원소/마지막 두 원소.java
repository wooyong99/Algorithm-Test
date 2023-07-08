import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public int[] solution(int[] num_list) {
        int last_ele = num_list[num_list.length-1];
        int before_ele = num_list[num_list.length-2];
        List list = new ArrayList();
        for(int e : num_list){
            list.add(e);
        }
        if( last_ele > before_ele ){
            list.add(last_ele-before_ele);
        }else{
            list.add(last_ele*2);
        }
        return list.stream().mapToInt(e->(int)e).toArray();
    }
}