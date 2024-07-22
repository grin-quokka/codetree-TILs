import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("");
        int num = 0;

        for(int i = 0; i < arr.length; i++){
            num = num * 2 + Integer.parseInt(arr[i]);
        }

        System.out.print(num);
    }
}