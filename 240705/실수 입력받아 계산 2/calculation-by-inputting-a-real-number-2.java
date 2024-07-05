import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        String format = String.format("%.2f", a + 1.5);
        System.out.println(format);
    }
}