import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        if(isPalindrome(A)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean isPalindrome(String A){
        for(int i = 0; i < A.length() / 2; i++){
            if(A.charAt(i) != A.charAt(A.length() - i - 1)){
                return false;
            }
        }

        return true;
    }
}