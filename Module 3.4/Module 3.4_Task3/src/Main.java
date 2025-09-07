import java.io.*;

public class Main {
    private final static String fileName = "enrollment.ser";

    public static void main(String[] args) {
        Student student = new Student(5, "Blendi", 23);
        Course course = new Course("MKD500", "JavaProgramming", "Matti");
        Enrollment enrollment = new Enrollment(student, course, "07.09.2025");

        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(enrollment);
            System.out.println("Enrollment serialized to " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Enrollment deserialized = (Enrollment) ois.readObject();

            System.out.println("Deserialized Enrollment:");
            System.out.println("Student: " + deserialized.getStudent().getName());
            System.out.println("Course: " + deserialized.getCourse().getCourseName());
            System.out.println("Instructor: " + deserialized.getCourse().getInstructor());
            System.out.println("Enrollment Date: " + deserialized.getEnrollmentDate());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
