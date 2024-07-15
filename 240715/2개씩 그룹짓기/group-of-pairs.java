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
        int max = 0;

        for(int i = 0; i < len / 2; i++){
            if(arr[i] + arr[len - 1 - i] > max){
                max = arr[i] + arr[len - 1 - i];
            }
        }
        
        System.out.print(max);
    }
}