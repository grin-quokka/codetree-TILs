import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int MAX = 100000;
        int[] arr = new int[MAX];

        while(true){
            if(n < 2){
                arr[cnt] = n;
                break;
            }

            arr[cnt] = n % 2;
            n /= 2;
            cnt++;
        }

        // 거꾸로 출력
        for(int i = cnt; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}