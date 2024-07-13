import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(getSequence(n));
    }

    public static int getSequence(int n){
        if(n == 1){
            return 2;
        }
        if(n == 2){
            return 4;
        }

        return getSequence(n - 2) * getSequence(n - 1) % 100;
    }
}