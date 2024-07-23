import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int offset = 100 * 1000;
        int[] tiles = new int[offset * 2];
        int cur = offset;
        int min_L = offset;
        int max_R = 0;
        int black = 0;
        int gray = 0;
        int white = 0;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            String dir = sc.next();

            if(dir.equals("L")){
                cur -= x;
                for(int j = cur; j < cur + x; j++){
                    tiles[j]++;
                }
            }else{
                for(int j = cur; j < cur + x; j++){
                    tiles[j]++;
                }
                cur += x;
            }

            if(cur < min_L){
                min_L = cur;
            }

            if(cur > max_R){
                max_R = cur;
            }
        }

        for(int i = min_L; i <= max_R; i++){
            int tile = tiles[i];

            if(tile < 1){
                continue;
            }

            if(tile >= 4){
                gray++;
            }else if(i == cur && i == min_L){
                white++;
            }else if(i <= cur){
                black++;
            }else{
                white++;
            }
        }

        System.out.print(white + " " + black + " " + gray);
    }
}