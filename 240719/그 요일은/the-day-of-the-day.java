import java.util.Scanner;

public class Main {
    // 2024년 1월 1일부터 m월 d일까지의 일수
    static int countDay(int m, int d){
        int[] daysOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for(int i = 1; i < m; i++){
            sum += daysOfMonth[i];
        }

        return sum + d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String targetDay = sc.next();
        String[] dayOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int idxOfTargetDay = 0;

        for (int i = 0; i < dayOfWeek.length; i++) {
            if (dayOfWeek[i].equals(targetDay)) {
                idxOfTargetDay = i;
                break;
            }
        }

        // m2, d2에서 m1, d1 사이 일자
        int diff = countDay(m2, d2) - countDay(m1, d1);
        
        // 해당 요일이 주차만큼 등장
        int cnt = diff / 7;

        // 주차를 제외한 나머지가 목표 요일 안에 속하면 1번 더 등장
        if(diff % 7 >= idxOfTargetDay || diff % 7 == 0){
            cnt += 1;
        }

        System.out.print(cnt);
    }
}