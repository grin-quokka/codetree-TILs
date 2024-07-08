import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String sum = (a + b) + "";
        int cnt = 0;

        for(String num : sum.split("")){
            if(num.equals("1")){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}