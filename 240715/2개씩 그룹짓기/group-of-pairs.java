import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = n * 2;
        Integer[] arr = new Integer[len];
        
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int max = arr[len / 2 - 1] + arr[len / 2];
        System.out.print(max);
    }
}