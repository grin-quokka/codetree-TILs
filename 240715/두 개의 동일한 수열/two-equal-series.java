import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] A = new Integer[n];
        Integer[] B = new Integer[n];

        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            B[i] = sc.nextInt();
        }

        System.out.print(isSameArr(A, B));
        
    }

    public static String isSameArr(Integer[] A, Integer[] B){
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++){
            if(A[i] != B[i]){
                return "No";
            }
        }

        return "Yes";
    }
}