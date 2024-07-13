import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mul = 1;
        for(int i = 0; i < 3; i++){
            mul *= sc.nextInt();
        }
        System.out.print(getSum(mul));
    }

    public static int getSum(int x){
        if(x < 10){
            return x;
        }
        return getSum(x / 10) + x % 10;
    }
}