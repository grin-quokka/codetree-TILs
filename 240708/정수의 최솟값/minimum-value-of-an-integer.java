import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int MIN = getMin(a, b, c);
        System.out.print(MIN);
        
    }

    public static int getMin(int a, int b, int c){
        int ab = Math.min(a, b);

        if(ab == a){
            return Math.min(a, c);
        }

        return Math.min(b, c);
    }
}