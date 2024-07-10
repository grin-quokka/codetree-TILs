import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper A = new IntWrapper(a);
        IntWrapper B = new IntWrapper(b);

        calc(A, B);

        a = A.value;
        b = B.value;

        System.out.print(a + " " + b);
    }

    public static void calc(IntWrapper A, IntWrapper B){
        if(A.value > B.value){
            A.value *= 2;
            B.value += 10;
        }else{
            A.value += 10;
            B.value *= 2;
        }
    }

}

class IntWrapper{
    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}