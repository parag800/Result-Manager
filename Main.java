import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        for (int i = 0; i < students.length; i++) {

            System.out.println("Enter information for Student " + (i + 1));

            System.out.print("ID: ");
            students[i].id = input.nextInt();

            input.nextLine(); // Buffer

            System.out.print("Name: ");
            students[i].name = input.nextLine();

            System.out.print("Marks: ");
            students[i].marks = input.nextDouble();

            System.out.println();
        }

        System.out.println("===== Student Information =====");

        for (int i = 0; i < students.length; i++) {
            students[i].showInfo();
        }

        Student topper = students[0];

        for (int i = 0; i < students.length; i++) {

            if (students[i].marks > topper.marks) {
                topper = students[i];
            }
        }

        System.out.println("\n===== Top Student =====");
        topper.showInfo();

        double total = 0;

        for (int i = 0; i < students.length; i++) {
            total += students[i].marks;
        }

        System.out.println("\nAverage Marks: " + (total / students.length));

        input.close();
    }
}