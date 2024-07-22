import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        String result = "";
        

        while(true){
            result = N % B + result;
            if(N < B){
                break;
            }
            N /= B;
        }

        System.out.print(result);
    }
}