import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int offset = 100;
        int max = 0;
        int[] line = new int[200];
        int n = sc.nextInt();


        for(int i = 2; i <= n; i++){
            int x1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;

            for(int j = x1; j < x2; j++){
                line[j]++;
            }
        }

        for(int cnt:line){
            if(max < cnt){
                max = cnt;
            }
        }

        System.out.print(max);
    }
}