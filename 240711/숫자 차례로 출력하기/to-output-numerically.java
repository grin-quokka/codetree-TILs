import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printASC(N);
        System.out.println();
        printDESC(N);
    }

    public static void printASC(int N){
        if(N == 0){
            return;
        }

        printASC(N - 1);
        System.out.print(N + " ");
    }

    public static void printDESC(int N){
        if(N == 0){
            return;
        }

        System.out.print(N + " ");
        printDESC(N - 1);
    }
}