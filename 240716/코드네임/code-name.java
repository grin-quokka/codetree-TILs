import java.util.Scanner;

class Code{
    char codeName;
    int score;

    Code(){
        this.codeName = ' ';
        this.score = 0;
    }

    Code(char codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Code[] codeArr = new Code[5];
        int minIdx = 0;
        int min = 100;
        
        for(int i = 0; i < 5; i++){
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();
            Code code = new Code(codeName, score);
            codeArr[i] = code;

            if(score < min){
                min = score;
                minIdx = i;
            }
        }

        System.out.print(codeArr[minIdx].codeName + " " + codeArr[minIdx].score);
    }
}