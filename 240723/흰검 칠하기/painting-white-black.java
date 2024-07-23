import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int offset = 100 * 1000;
        String[] tiles = new String[offset * 2];
        int cur = offset;
        int black = 0;
        int gray = 0;
        int white = 0;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            String dir = sc.next();

            if(dir.equals("L")){
                for(int j = cur; j > cur - x; j--){
                    tiles[j] = tiles[j] == null ? "W" : "W" + tiles[j];
                    
                }
                cur = cur - x + 1;
            }else{
                for(int j = cur; j < cur + x; j++){ 
                    tiles[j] = tiles[j] == null ? "B" : "B" + tiles[j];
                }
                cur = cur + x - 1;
            }
        }

        for(int i = 0; i < tiles.length; i++){
            String tile = tiles[i];

            if(tile == null){
                continue;
            }

            if(tile.length() >= 4){
                gray++;
            }else if(tile.charAt(0) == 'W'){
                white++;
            }else{
                black++;
            }
        }

        System.out.print(white + " " + black + " " + gray);
    }
}