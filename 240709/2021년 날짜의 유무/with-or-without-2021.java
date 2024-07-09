import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();

        if(isExistMD(M, D)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean isExistMD(int M, int D){
        if(M > 12){
            return false;
        }

        if(D > 31){
            return false;
        }

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(days[M - 1] < D){
            return false;
        }

        return true;
    }
}