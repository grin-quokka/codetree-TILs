import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int height, weight;

    Student(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student){
        if(this.height != student.height){
            return this.height - student.height;
        }

        return student.weight - this.weight;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++){
            Student s = students[i];
            System.out.println(s.name + " " + s.height + " " + s.weight);
        }
    }
}