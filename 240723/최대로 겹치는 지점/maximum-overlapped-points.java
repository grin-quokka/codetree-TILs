import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[] line = new int[100];

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for(int j = x1; j <= x2; j++){
                line[j]++;
            }
        }

        for(int cnt: line){
            if(max < cnt){
                max = cnt;
            }
        }

        System.out.print(max);
    }
}