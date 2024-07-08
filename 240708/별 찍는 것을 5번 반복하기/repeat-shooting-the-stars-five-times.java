public class Main {
    public static void main(String[] args) {
        
        for(int i = 0; i < 5; i++){
            stars();
        }
    }

    static void stars(){
        for(int i = 0; i < 10; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}