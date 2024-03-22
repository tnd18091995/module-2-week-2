package Linkedlist;
import java.util.LinkedList;
import java.util.List;

public class Ex {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        List<Student> A = new LinkedList<>();
        for(int i = 0; i < NUM_OF_ELEMENT; i++){
            Student student = new Student(i, "my name"+i);
            A.add(student);
        }
        for(Student student: A){
            System.out.println(student);
        }
    }
}
