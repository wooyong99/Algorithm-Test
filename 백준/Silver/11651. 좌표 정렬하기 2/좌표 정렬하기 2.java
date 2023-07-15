import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] arr = new int[n][2];

        for(int i = 0; i<n; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            arr[i][0] = x;
            arr[i][1] = y;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1] == 0 ? o1[0] - o2[0] : o1[1] - o2[1];
            }
        });

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}