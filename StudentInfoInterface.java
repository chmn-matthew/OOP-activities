package studentinfo;
import java.util.Scanner;

public class StudentInfoInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter suffix (if any, press Enter to skip): ");
        String suffix = scanner.nextLine();

        // Conditionally create a Student instance based on the presence of a suffix
        Student student;
        if (suffix.isEmpty()) {
            student = new Student(firstName, middleName, lastName, null);
        } else {
            student = new Student(firstName, middleName, lastName, suffix);
        }

        System.out.println("\nStudent Information:");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Middle Name: " + student.getMiddleName());
        System.out.println("Last Name: " + student.getLastName());

        if (!suffix.isEmpty()) {
            System.out.println("Suffix: " + student.getSuffix());
        }

        System.out.println("Full Name: " + student.getFullName());

        scanner.close();
    }
}