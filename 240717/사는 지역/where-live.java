import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Info {
    String name;
    String addr;
    String city;

    Info(String name, String addr, String city){
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Info[] infoArr = new Info[n];

        for(int i = 0; i < n; i++){
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();

            Info info = new Info(name, addr, city);
            infoArr[i] = info;
        }

        Arrays.sort(infoArr, Comparator.comparing(a -> a.name));
        System.out.println("name " + infoArr[n - 1].name);
        System.out.println("addr " + infoArr[n - 1].addr);
        System.out.println("city " + infoArr[n - 1].city);
    }
}