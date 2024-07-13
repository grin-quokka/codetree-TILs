import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sequence(n));
    }

    public static int sequence(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        return sequence(n / 3) + sequence(n - 1);
    }
}