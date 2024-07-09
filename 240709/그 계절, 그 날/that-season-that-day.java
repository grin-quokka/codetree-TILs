import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        if(isExist(Y, M, D)){
            System.out.print(getSeason(M));
        }else{
            System.out.print(-1);
        }
    }

    public static boolean isExist(int Y, int M, int D){
        if(getLastDay(Y, M, D) < D){
            return false;
        }

        return true;
    }

    public static int getLastDay(int Y, int M, int D){
        if(M == 2){
            if(isLeapYear(Y)){
                return 29;
            }

            return 28;
        }

        if(M == 4 || M == 6 || M == 9 || M == 11){
            return 30;
        }

        return 31;
    }

    public static boolean isLeapYear(int Y){
        if(Y % 4 == 0){
            if(Y % 100 == 0){
                if(Y % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }        
        return false;
    }

    public static String getSeason(int M){
        if(M == 12){
            return "Winter";
        }

        if(M >= 9){
            return "Fall";
        }

        if(M >= 6){
            return "Summer";
        }

        if(M >= 3){
            return "Spring";
        }

        return "Winter";
    }
}