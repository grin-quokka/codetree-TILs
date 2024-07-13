import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(sum(N));
    }

    public static int sum(int N){
        if(N == 1){
            return 1;
        }

        if(N == 0){
            return 0;
        }

        return sum(N - 2) + N;
        
    }
}