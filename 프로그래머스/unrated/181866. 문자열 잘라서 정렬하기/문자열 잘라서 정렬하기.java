import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String[] solution(String myString) {
        List<String> list = Stream.of(myString.split("x")).collect(Collectors.toList());
        List<String> del = new ArrayList<>();
        del.add("");
        list.removeAll(del);
        String[] answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        return answer;
    }
}