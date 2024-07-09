import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        divide(arr);

        for(String s:arr){
            System.out.print(s + " ");
        }
    }

    public static void divide(String[] arr){
        for(int i = 0; i < arr.length; i++){
            int num = Integer.parseInt(arr[i]);

            if(num % 2 == 0){
                arr[i] = Integer.toString(num / 2);
            }
        }
    }
}