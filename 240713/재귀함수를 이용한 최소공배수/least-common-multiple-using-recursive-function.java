import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(getLCMinArr(arr, n - 1));
    }

    public static int lcm(int a, int b){
        for(int i = Math.min(a, b); i < a * b; i++){
            if(i % a == 0 && i % b == 0){
                return i;
            }
        }

        return a * b;
    }

    public static int getLCMinArr(int[] arr,int n){
        if(n == 0){
            return arr[0];
        }
        return lcm(getLCMinArr(arr, n - 1), arr[n]);
    }
}