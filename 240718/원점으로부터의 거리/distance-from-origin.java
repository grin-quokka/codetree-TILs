import java.util.Scanner;
import java.util.Arrays;

class Dot implements Comparable<Dot>{
    int id;
    int x, y;

    Dot(int id, int x, int y){
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Dot dot){
        int distanceOrigin = Math.abs(this.x - 0) + Math.abs(this.y - 0);
        int distanceOther = Math.abs(dot.x - 0) + Math.abs(dot.y - 0);

        if(distanceOrigin != distanceOther){
            return distanceOrigin - distanceOther;
        }

        return this.id - dot.id;
        
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dot[] dots = new Dot[n];

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            dots[i] = new Dot(i + 1, x, y);
        }

        Arrays.sort(dots);

        for(int i = 0; i < n; i++){
            System.out.println(dots[i].id);
        }
    }
}