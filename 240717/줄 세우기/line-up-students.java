import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int id, height, weight;

    Student(int id, int height, int weight){
        this.id = id;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student){
        if(this.height != student.height){
            return student.height - this.height;
        }

        if(this.weight != student.weight){
            return student.weight - this.weight;
        }

        return this.id - student.id;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(i + 1, height, weight);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++){
            Student s = students[i];
            System.out.println(s.height + " " + s.weight + " " + s.id);
        }
    }
}