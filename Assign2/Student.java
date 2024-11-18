package Assign2;

/**
 * The Student class represents a student with attributes such as name, ID, email, and grade.
 * It implements the Comparable interface to allow sorting by grade.
 */
public class Student implements Comparable<Student> {

    /** The name of the student. */
    private String name;

    /** The unique ID of the student. */
    private int id;

    /** The email address of the student. */
    private String email;

    /** The grade of the student. */
    private double grade;

    /**
     * Constructs a new Student object with the specified details.
     *
     * @param name  the name of the student
     * @param id    the unique ID of the student
     * @param email the email address of the student
     * @param grade the grade of the student
     */
    public Student(String name, int id, String email, double grade) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.grade = grade;
    }

    /**
     * Gets the name of the student.
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     *
     * @param name the new name of the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the ID of the student.
     *
     * @return the ID of the student
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the student.
     *
     * @param id the new ID of the student
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the email of the student.
     *
     * @return the email of the student
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the student.
     *
     * @param email the new email of the student
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the grade of the student.
     *
     * @return the grade of the student
     */
    public double getGrade() {
        return grade;
    }

    /**
     * Sets the grade of the student.
     *
     * @param grade the new grade of the student
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * Compares this student with another student by grade.
     *
     * @param other the other student to compare
     * @return a negative integer, zero, or a positive integer if this student's grade
     *         is less than, equal to, or greater than the specified student's grade
     */
    @Override
    public int compareTo(Student other) {
        return Double.compare(this.grade, other.grade);
    }

    /**
     * Returns a string representation of the student.
     *
     * @return a string representation of the student
     */
    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + ", email='" + email + "', grade=" + grade + "}";
    }
}
