import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = calc(N);
        System.out.print(result);
    }

    public static int calc(int N){
        int pairSum = (1 + N) * (N / 2);

        if( N % 2 == 0){
            return pairSum / 10;
        }
        
        return (pairSum + ((1 + N) / 2)) / 10;
    }
}