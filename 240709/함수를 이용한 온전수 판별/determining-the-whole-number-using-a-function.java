import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(countMagicNumber(a, b));
    }

    public static int countMagicNumber(int a, int b){
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(isMagicNumber(i)){
                cnt++;
            }
        }

        return cnt;
    }

    public static boolean isMagicNumber(int n){
        if(n % 2 == 0){
            return false;
        }

        if(n % 10 == 5){
            return false;
        }

        if(n % 3 == 0 && n % 9 != 0){
            return false;
        }

        return true;
    }
}