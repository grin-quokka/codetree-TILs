import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(getSquareSum(N));
    }

    public static int getSquareSum(int N){
        if(N < 10){
            return (int)(Math.pow((double)(N % 10), 2.0));
        }

        return getSquareSum(N / 10) + (int)(Math.pow((double)(N % 10), 2.0));
    }
}