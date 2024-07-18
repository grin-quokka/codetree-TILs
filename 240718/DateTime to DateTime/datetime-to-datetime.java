import java.util.Scanner;

public class Main {
    static int getMins(int day, int hour, int min){
        return min + hour * 60 + 24 * 60 * day;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 11월 1일 0시 0분 ~ 11월 11일 11시 11분
        if(getMins(11, 11, 11) > getMins(a, b, c)){
            System.out.print(-1);
        }else{
            System.out.print(getMins(a, b, c) - getMins(11, 11, 11));
        }

    }
}