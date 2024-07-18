import java.util.Scanner;

public class Main {
    static int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        System.out.print(getPastDays(m2, d2) - getPastDays(m1, d1) + 1);
        
    }

    public static int getPastDays(int m, int d){
        int days = 0;

        for(int i = 1; i < m; i++){
            days += daysOfMonth[i];
        }

        days += d;

        return days;
    }
}