import java.util.Scanner;

class User{
    String id;
    int lv;

    User(){
        this.id = "codetree";
        this.lv = 10;
    }

    User(String id, int lv){
        this.id = id;
        this.lv = lv;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int lv = sc.nextInt();
        User user1 = new User();
        User user2 = new User(id, lv);

        System.out.println("user " + user1.id + " lv " + user1.lv);
        System.out.println("user " + user2.id + " lv " + user2.lv);
    }
}