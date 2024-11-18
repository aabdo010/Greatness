package Assign2;

import java.util.Arrays;

/**
 * The Main class demonstrates the use of the Student and StudentManager classes.
 * It creates students, stores them in an array and an ArrayList, sorts them, and displays them.
 */
public class Main {

    /**
     * The entry point of the program. Demonstrates sorting of students
     * in both an array and an ArrayList.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Create student objects
        Student s1 = new Student("Alice", 1, "alice@example.com", 3.5);
        Student s2 = new Student("Bob", 2, "bob@example.com", 3.8);
        Student s3 = new Student("Charlie", 3, "charlie@example.com", 3.2);
        Student s4 = new Student("Diana", 4, "diana@example.com", 3.9);

        // Store students in an array and an ArrayList
        Student[] studentArray = {s1, s2, s3, s4};
        StudentManager manager = new StudentManager();
        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        manager.addStudent(s4);

        // Display array and ArrayList before sorting
        System.out.println("Array before sorting:");
        for (Student student : studentArray) {
            System.out.println(student);
        }

        System.out.println("\nArrayList before sorting:");
        manager.displayStudents();

        // Sort the array and the ArrayList
        Arrays.sort(studentArray);
        manager.sortStudents();

        // Display array and ArrayList after sorting
        System.out.println("\nArray after sorting:");
        for (Student student : studentArray) {
            System.out.println(student);
        }

        System.out.println("\nArrayList after sorting:");
        manager.displayStudents();
    }
}
