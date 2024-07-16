import java.util.Scanner;

class Product {
    String name;
    int code;

    Product(){
        this.name = "";
        this.code = 0;
    }

    Product(String name, int code){
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product1 = new Product();
        product1.name = "codetree";
        product1.code = 50;

        String inputName = sc.next();
        int inputCode = sc.nextInt();
        Product product2 = new Product(inputName, inputCode);

        System.out.println("product " + product1.code +" is " + product1.name);
        System.out.println("product " + product2.code +" is " + product2.name);
    }
}