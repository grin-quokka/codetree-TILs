import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    String name;
    int height;
    double weight;

    Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for(int i = 0; i < 5; i++){
            String name = sc.next();
            int height = sc.nextInt();
            double weight = Double.parseDouble(sc.next());
            students[i] = new Student(name, height, weight);
        }

        System.out.println("name");
        Arrays.sort(students, Comparator.comparing((a) -> a.name));
        
        for(int i = 0; i < 5; i++){
            Student s = students[i];
            System.out.println(s.name + " " + s.height + " " + s.weight);
        }

        System.out.println();
        System.out.println("height");
        Arrays.sort(students, (a, b) -> b.height - a.height);

        for(int i = 0; i < 5; i++){
            Student s = students[i];
            System.out.println(s.name + " " + s.height + " " + s.weight);
        }
       
    }
}