import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(sumPrimeNumbers(a, b));
    }

    public static int sumPrimeNumbers(int a, int b){
        int sum = 0;
        
        for(int i = a; i <= b; i++){
            if(isPrimeNumber(i)){
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isPrimeNumber(int n){
        for(int i = 2; i < n / 2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}