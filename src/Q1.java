// Q1.java
public class Q1 {
    int rollNo;
    String name;
    double marks;

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        // Creating an object of Q1 (Student)
        Q1 student = new Q1();
        student.rollNo = 101;
        student.name = "Vishal";
        student.marks = 85.5;

        // Displaying student details
        student.display();
    }
}
