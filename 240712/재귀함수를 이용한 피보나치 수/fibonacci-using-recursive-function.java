import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(fib(N));
    }

    public static int fib(int N){
        if(N == 1 || N == 2){
            return 1;
        }

        return fib(N - 1) + fib(N - 2);

    }
}