import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int offset = 100 * 10; // 왼쪽으로 최대한 이동 할 수 있는 수
        int[] line = new int[offset * 2]; // 마이너스가 되지 않도록 오른쪽으로 이동
        int cur = offset;

        // 이동할 때 마다 +1
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            String direction = sc.next();

            if(direction.equals("L")){
                cur -= x;
                for(int j = cur; j < cur + x; j++){
                    line[j]++;
                }
                
            }else{
                for(int j = cur; j < cur + x; j++){
                    line[j]++;
                }
                cur += x;
            }
        }

        // 2번 이상 지나갔을 경우 합산
        int sum = 0;
        for(int i = 0; i < line.length; i++){
            if(line[i] >= 2){
                sum++;
            }
        }

        System.out.print(sum);
    }
}