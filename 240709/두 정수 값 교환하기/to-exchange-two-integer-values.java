import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Num a = new Num(n);
        Num b = new Num(m);
        swap(a, b);
        System.out.print(a.value + " " + b.value);
    }

    public static void swap(Num a, Num b){
        int temp = b.value;
        b.setValue(a.value);
        a.setValue(temp);
    }
}

class Num {
    int value;

    Num(int value){
        this.value = value;
    }

    void setValue(int value){
        this.value = value;
    }
}