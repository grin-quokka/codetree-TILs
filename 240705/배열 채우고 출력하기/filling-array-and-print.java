import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        for(int i = 9; i >= 0; i--){
            System.out.print(words[i]);
        }
    }
}