import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String[] solution(String my_string) {
        List<String> list= new ArrayList<>();
        
        my_string = my_string.replaceAll("\\s+"," ");
        
        list = Stream.of(my_string.split(" ")).collect(Collectors.toList());
        list.remove("");
        
        return list.toArray(new String[list.size()]);
    }
}