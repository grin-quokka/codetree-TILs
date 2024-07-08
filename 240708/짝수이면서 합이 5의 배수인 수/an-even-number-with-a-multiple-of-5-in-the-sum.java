import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
        if(isMagicalNumber(n)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean isMagicalNumber(int n){
        if(n % 2 != 0){
            return false;
        }

        String[] str = Integer.toString(n).split("");
        int sum = 0;

        for(String s:str ){
            sum += Integer.parseInt(s);
        }

        if(sum % 5 == 0){
            return true;
        }

        return false;
    }
}