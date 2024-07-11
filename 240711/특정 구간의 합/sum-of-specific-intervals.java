import java.util.Scanner;

public class Main {
    static int MAX_N = 100;
    static int[] A = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        sc.nextLine();

        for(int i = 0; i < m; i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int sum = 0;

            for(int j = a1; j <= a2; j++){
                sum += A[j - 1];
            }

            System.out.println(sum);
        }
    
    }
}