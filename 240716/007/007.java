import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] secret = sc.nextLine().split(" ");
        Spy spy = new Spy(secret[0], secret[1].charAt(0), Integer.parseInt(secret[2]));
        System.out.println("secret code : " + spy.secretCode);
        System.out.println("meeting point : " + spy.meetingPoint);
        System.out.println("time : " + spy.time);
    }

    public static class Spy {
        String secretCode;
        char meetingPoint;
        int time;

        public Spy(String secretCode, char meetingPoint, int time){
            this.secretCode = secretCode;
            this.meetingPoint = meetingPoint;
            this.time = time;
        }
    }
}