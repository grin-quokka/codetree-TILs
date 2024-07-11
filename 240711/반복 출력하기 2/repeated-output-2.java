import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        recursive(N);
    }

    public static void recursive(int N){
        if(N == 0){
            return;
        }

        System.out.println("HelloWorld");
        recursive(N - 1);
    }
}