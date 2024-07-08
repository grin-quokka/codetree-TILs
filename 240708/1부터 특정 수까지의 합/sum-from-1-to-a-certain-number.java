import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = calc(N);
        System.out.print(result);
    }

    public static int calc(int N){
        return (1 + N) * (N / 2) / 10;
    }
}