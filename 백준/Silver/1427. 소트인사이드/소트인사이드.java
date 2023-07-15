import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        char[] arr1 = input.toCharArray();
        String[] arr2 = new String[arr1.length];

        for(int i = 0; i<arr1.length; i++){
            arr2[i] = String.valueOf(arr1[i]);
        }
        Arrays.sort(arr2, Collections.reverseOrder());
        StringBuilder sbd = new StringBuilder();
        Arrays.stream(arr2).forEach(n -> {
            sbd.append(n);
        });
        System.out.println(sbd);
    }
}