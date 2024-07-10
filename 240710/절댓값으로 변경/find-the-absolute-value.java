import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");

        abs(arr);

        for(String s:arr){
            System.out.print(Integer.parseInt(s) + " ");
        }
    }

    public static void abs(String[] arr){
        for(int i = 0; i < arr.length; i++){
            int ele = Integer.parseInt(arr[i]);

            if(ele < 0){
                arr[i] = (ele * -1) + "";
            }
        }
    }
}