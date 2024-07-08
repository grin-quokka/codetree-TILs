import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        square(N);
    }

    public static void square(int N){
        int cnt = 1;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(cnt == 10){
                    cnt = 1;
                }
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println();
        }
    }
}