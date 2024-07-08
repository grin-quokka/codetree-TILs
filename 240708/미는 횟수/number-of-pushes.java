import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();
        boolean flag = true;

        for(int i = 0; i < A.length(); i++){
            if(B.equals(A)){
                System.out.println(i);  
                flag = false;  
                break;
            }
            A = A.substring(1) + A.substring(0, 1);
        }

        if(flag){
            System.out.println(-1);
        }            
    }
}