package Assign2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The StudentManager class manages a list of Student objects,
 * allowing addition, removal, sorting, and displaying of students.
 */
public class StudentManager {

    /** A list of students managed by the StudentManager. */
    private ArrayList<Student> students;

    /**
     * Constructs a new StudentManager with an empty list of students.
     */
    public StudentManager() {
        this.students = new ArrayList<>();
    }

    /**
     * Adds a student to the list.
     *
     * @param student the student to add
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Removes a student from the list
     */
    public void removeStudent(Student student) {
        students.remove(student);
    }

    /**
     * Sorts the students in the list by grade in ascending order.
     */
    public void sortStudents() {
        Collections.sort(students);
    }

    /**
     * Displays all students in the list.
     */
    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
