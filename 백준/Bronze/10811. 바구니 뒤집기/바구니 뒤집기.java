import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = IntStream.rangeClosed(1,n).toArray();

        for(int k = 0; k<m; k++){
            int i = scan.nextInt()-1;
            int j = scan.nextInt()-1;
            List<Integer> list = new ArrayList<>();
            for(int h = i; h<=j; h++){
                list.add(arr[h]);
            }
            Collections.reverse(list);

            int idx = 0;
            for(int h = i; h<=j; h++){
                arr[h] = list.get(idx);
                idx++;
            }
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}