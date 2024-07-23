import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int offset = 100 * 1000;
        int[] line = new int[offset * 2];
        int cur = offset;
        int white = 0;
        int black = 0;


        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            String dir = sc.next();

            if(dir.equals("L")){
                while(--x > 0){
                    line[cur] = -1;
                    cur--;
                }
            }else{
                while(--x > 0){
                    line[cur] = 1;
                    cur++;
                }
            }
        }

        for(int i = 0; i < line.length; i++){
            int tile = line[i];
            if(tile == 0){
                continue;
            }

            if(tile == -1){
                white++;
            }else{
                black++;
            }
        }

        System.out.print(white + " " + black);
    }
}