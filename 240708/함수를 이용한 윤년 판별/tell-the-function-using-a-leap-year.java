import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.print(isLeapYear(y));
    }

    public static boolean isLeapYear(int y){
        if(isNotLeapYear(y)){
            return false;
        }

        if(y % 4 == 0){
            return true;
        }

        return false;
    }

    public static boolean isNotLeapYear(int y){
        return y % 100 == 0 && y % 400 != 0;
    }
}