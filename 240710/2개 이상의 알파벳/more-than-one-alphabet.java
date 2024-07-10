import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        if(isDifferent(A)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean isDifferent(String A){
        char first = A.charAt(0);

        for(int i = 1; i < A.length(); i++){
            if(first != A.charAt(i)){
                return true;
            }  
        }
        return false;
    }
}