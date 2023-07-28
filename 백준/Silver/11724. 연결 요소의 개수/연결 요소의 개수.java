import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr ;
    static int N;
    static boolean[] node;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
//        왜? +1만큼 배열을 생성하는지 이해가 안된다....
        arr = new int[N+1][N+1];
        node = new boolean[N+1];
        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());
//            무방향 그래프 특징에 따라 코드 작성
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        cnt = 0;
        for(int i = 1; i<=N; i++){
            if(node[i] == false){
                DFS(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    static void DFS(int value){
        if(node[value] == true){
            return;
        }
        node[value] = true;
        for(int i =1;i<=N;i++){
            if(arr[value][i] == 1){
                DFS(i);
            }
        }
    }
}