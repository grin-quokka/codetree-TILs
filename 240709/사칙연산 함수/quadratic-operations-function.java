import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String O = sc.next();
        int C = sc.nextInt();

        if(isArithmeticOperator(O)){
            System.out.print("False");
        }else{
            System.out.print(A +" "+ O + " " + C + " = " + calc(A, O, C));
        }
    }

    public static boolean isArithmeticOperator(String O){
        return !O.equals("+") && !O.equals("-") && !O.equals("*") && !O.equals("/");
    }

    public static int calc(int A, String O, int C){
        if(O.equals("+")){
            return A + C;
        }
        if(O.equals("-")){
            return A - C;
        }
        if(O.equals("*")){
            return A * C;
        }
        
        return A / C;
        
    }
}