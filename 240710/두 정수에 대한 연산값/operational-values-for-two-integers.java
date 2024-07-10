import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        NumWrapper A = new NumWrapper(a);
        NumWrapper B = new NumWrapper(b);

        calc(A, B);

        a = A.value;
        b = B.value;

        System.out.print(a + " " + b);
    }

    public static void calc(NumWrapper A, NumWrapper B){
        if(A.value > B.value){
            A.value += 25;
            B.value *= 2;
        }else{
            A.value *= 2;
            B.value += 25;
        }
    }
}

class NumWrapper{
    public int value;

    NumWrapper(int value){
        this.value = value;
    }
}