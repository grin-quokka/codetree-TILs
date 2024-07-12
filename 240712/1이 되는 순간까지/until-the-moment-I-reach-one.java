import java.util.Scanner;

public class Main {
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        count(N);
        System.out.print(cnt);
    }

    public static void count(int N){     
       if(N == 1){
        return;
       }

       if(N % 2 == 0){
        count(N / 2);
       }else{
        count(N / 3);
       }

       cnt++;

    }
}