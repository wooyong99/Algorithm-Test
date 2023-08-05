
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());

        for(int x= 0; x<n1; x++){
            Map<String, List<String>> map = new HashMap<>();
            List<String> list = new ArrayList<>();
            int n2 = Integer.parseInt(br.readLine());
            for(int i = 0; i<n2; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String input2 = st.nextToken();
                String input1 = st.nextToken();
                if(! map.containsKey(input1)){
                    map.put(input1, new ArrayList<>());
                    map.get(input1).add(input2);

                }else{
                    map.get(input1).add(input2);
                }
            }
            int rs = 1;
            for(List<String> v : map.values()){
                int size = v.size();
                rs *= (size+1);
            }

            System.out.println(rs-1);
        }
    }
}