import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String[] arr = new String[200];

        while(true){
            String word = sc.nextLine();

            if(word.equals("0")){
                break;
            }

            arr[cnt] = word;
            cnt++;
        }

        System.out.println(cnt);
        for(int i = 0; i < cnt; i++){
            if(i % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}