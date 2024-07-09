import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.nextLine();
        String A = sc.nextLine();
        String B = sc.nextLine();

        if(isSubsequence(A, B)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean isSubsequence(String A, String B){
        return A.contains(B);
    }
}