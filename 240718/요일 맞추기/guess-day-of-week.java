import java.util.Scanner;

public class Main {
    static int getPastDays(int m, int d){
        int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        for(int i = 1; i < m; i++){
            days += daysOfMonth[i];
        }
        return days + d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 두 날짜의 차이 일 수를 7로 나눈 나머지 -> 근데 -인지 + 인지에 따라 다름..
        String[] dayOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int diff = getPastDays(m2, d2) - getPastDays(m1, d1);

        if(diff < 0){
            System.out.print(dayOfWeek[(diff % 7) + 7]);
        }else{
            System.out.print(dayOfWeek[(diff % 7)]);
        }
    }
}