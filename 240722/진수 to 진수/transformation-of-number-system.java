import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[] n = sc.next().split("");
        int decimal = 0;
        String result = "";

        // a진수 -> 10진수
        for(int i = 0; i < n.length; i++){
            decimal = decimal * a + Integer.parseInt(n[i]);
        }

        // 10진수 -> b진수
        while(true){
            result = decimal % b + result;

            if(decimal < b){
                break;
            }

            decimal /= b;
        }

        System.out.print(result);
    }
}