import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] condition = sc.nextLine().split(" ");

        int n = Integer.parseInt(condition[0]);
        String A = condition[1];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            String target = sc.nextLine();
            if(A.equals(target)){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}