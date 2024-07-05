import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String words = sc.nextLine();

            if(words.equals("END")){
                break;
            }

            for(int i = words.length() - 1; i >= 0 ; i--){
                System.out.print(words.charAt(i));
            }

            System.out.println();
        }
    }
}