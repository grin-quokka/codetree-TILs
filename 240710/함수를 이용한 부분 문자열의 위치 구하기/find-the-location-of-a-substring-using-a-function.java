import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        String part = sc.nextLine();

        System.out.print(getStartIndex(target, part));
    }

    public static int getStartIndex(String target, String part){
        for(int i = 0; i < target.length(); i++){
            if(target.substring(i, i + part.length()).equals(part)){
                return i;
            }
        }

        return -1;
    }
}