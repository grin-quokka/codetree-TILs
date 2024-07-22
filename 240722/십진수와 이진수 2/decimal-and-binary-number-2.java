import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] N = sc.next().split("");
        int NtoTen = 0;
        String result = "";

        // 10진수 변환
        for(int i = 0; i < N.length; i++){
            NtoTen = NtoTen * 2 + Integer.parseInt(N[i]);
        }

        NtoTen *= 17;

        while(true){
            result = NtoTen % 2 + result;

            if(NtoTen < 2){
                break;
            }

            NtoTen /= 2;
        }

        System.out.print(result);
    }
}