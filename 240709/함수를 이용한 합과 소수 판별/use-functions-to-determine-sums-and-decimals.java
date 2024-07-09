import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(isPrime(i) && isSumEven(i)){
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i = 2; i <= n - 2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static boolean isSumEven(int n){
        String[] arr = Integer.toString(n).split("");
        int sum = 0;

        for(String s:arr){
            sum += Integer.parseInt(s);
        }

        return sum % 2 == 0;
    }
}