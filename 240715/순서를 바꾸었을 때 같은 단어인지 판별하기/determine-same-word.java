import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        char[] b = sc.nextLine().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if((new String(a)).equals(new String(b))){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}