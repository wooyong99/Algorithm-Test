import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        long count = 0;
        String num = "666";
        String end_num = "666";

        while(count < input){
            long empty = Integer.parseInt(num);
            if(num.contains(end_num)){
                count++;
            }
            empty++;
            num = String.valueOf(empty);
        }
        System.out.println(Integer.parseInt(num)-1);
    }
}