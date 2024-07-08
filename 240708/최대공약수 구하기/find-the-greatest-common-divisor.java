import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        getGCD(n, m);
        
    }

    public static void getGCD(int n, int m){
        int MIN = Math.min(n, m);

        for(int i = MIN; i >= 1; i--){
            if(n % i == 0 && m % i == 0){
                System.out.println(i);
                break;
            }
        }       
    }
}