import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int max = 0;
        int[] arr = new int[N + 1];

        // 블럭 쌓기
        for(int i = 0; i < K; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            for(int j = A; j <= B; j++){
                arr[j] += 1;
            }
        }

        // 최대값 찾기
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.print(max);
    }
}