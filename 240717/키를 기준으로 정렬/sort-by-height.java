import java.util.Scanner;
import java.util.Arrays;

class User {
    String name;
    int height;
    int weight;

    User(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        User[] users = new User[n];

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            User user = new User(name, height, weight);
            users[i] = user;
        }

        Arrays.sort(users, (a, b) -> a.height - b.height);

        for(int i = 0; i < n; i++){
            User user = users[i];
            System.out.println(user.name + " " + user.height + " " + user.weight);
        }
        
    }
}