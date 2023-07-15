import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scan.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i<n; i++){
            int input = scan.nextInt();
            arr[i] = input;
        }
        Collections.sort(Arrays.asList(arr));

        for(int value : arr) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}