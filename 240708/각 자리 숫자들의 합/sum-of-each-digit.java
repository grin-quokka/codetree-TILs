import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int sum = 0;

        for(String s: str.split("")){
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
    }
}