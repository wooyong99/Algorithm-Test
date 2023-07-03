import java.util.*;

class Member{
    String name;
    int age;
    Member(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("%d %s", age, name);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Member> arr = new ArrayList<>();
        int num = sc.nextInt();
        for(int i = 0; i< num; i++){
            int age = Integer.parseInt(sc.next());
            String name = sc.next();
            arr.add(new Member(name, age));
        }
        Collections.sort(arr, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                return m1.age - m2.age;
            }
        });
        for(Member m : arr){
            System.out.println(m.age + " " + m.name);
        }

    }
}
