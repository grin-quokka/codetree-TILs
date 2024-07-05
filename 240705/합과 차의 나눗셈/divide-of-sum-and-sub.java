import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double sum = a + b;
        String format = String.format("%.2f", sum / (a-b));
        System.out.println(format);
    }
}