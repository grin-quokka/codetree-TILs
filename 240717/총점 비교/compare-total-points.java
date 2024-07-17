import java.util.Scanner;
import java.util.Arrays;

class Score implements Comparable<Score>{
    String name;
    int kor;
    int eng;
    int math;

    Score(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Score score){
        return (this.kor + this.eng + this.math) - (score.kor + score.eng + score.math);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Score[] scores = new Score[n];

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            Score score = new Score(name, kor, eng, math);
            scores[i] = score;
        }

        Arrays.sort(scores);

        for(int i = 0; i < n; i++){
            Score score = scores[i];
            System.out.println(score.name + " " + score.kor + " " + score.eng + " " + score.math);
        }
    }
}