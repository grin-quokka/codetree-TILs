import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            String word = sc.nextLine();
            if(word.startsWith(T)){
                arr[i] = word;
            }
        }


        Arrays.sort(arr, Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.print(arr[k - 1]);
    }
}