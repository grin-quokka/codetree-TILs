import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int offset = 100 * 1000;
        String[] tiles = new String[offset * 2];
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
                for(int j = cur; j > cur - x; j--){
                    tiles[j] = tiles[j] == null ? "W" : tiles[j] + "W";
                    
                }
                cur = cur - x + 1;
            }else{
                for(int j = cur; j < cur + x; j++){ 
                    tiles[j] = tiles[j] == null ? "B" : tiles[j] + "B";
                }
                cur = cur + x - 1;
            }

            if(cur < min_L){
                min_L = cur;
            }

            if(cur > max_R){
                max_R = cur;
            }
        }

        for(int i = min_L; i <= max_R; i++){
            String tile = tiles[i];

            if(tile == null){
                continue;
            }

            if(tile.length() >= 4){
                gray++;
            }else if(tile.charAt(tile.length() - 1) == 'W'){
                white++;
            }else{
                black++;
            }
        }

        System.out.print(white + " " + black + " " + gray);
    }
}