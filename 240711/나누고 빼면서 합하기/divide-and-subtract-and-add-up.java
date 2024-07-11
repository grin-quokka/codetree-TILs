import java.util.Scanner;

public class Main {
    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        int[] A = new int[N];
        
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        System.out.print(calc(A));
    }

    public static int calc(int[] A){
        int sum = 0;
        
        while(M != 1){
            sum += A[M - 1];

            if(M % 2 == 0){
                M /= 2;
            }else{
                M -= 1;
            }
        }

        sum += A[0];

        return sum;
    }
}