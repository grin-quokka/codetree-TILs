import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(i % 3 == 0 || is369(i)){
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    public static boolean is369(int i){
        String str = Integer.toString(i);

        return str.contains("3") || str.contains("6") || str.contains("9");
    }
}