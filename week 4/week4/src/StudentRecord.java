import java.util.Scanner;

public class StudentRecord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of student 1: ");
        String name1 = sc.nextLine();

        System.out.print("Enter student ID: ");
        String id1 = sc.nextLine();

        System.out.print("Enter mark: ");
        int mark1 = sc.nextInt();
        sc.nextLine();

        Student s1 = new Student(name1, id1, mark1);


        System.out.print("\nEnter name of student 2: ");
        String name2 = sc.nextLine();

        System.out.print("Enter student ID: ");
        String id2 = sc.nextLine();

        System.out.print("Enter mark: ");
        int mark2 = sc.nextInt();
        sc.nextLine();

        Student s2 = new Student(name2, id2, mark2);


        System.out.print("\nEnter name of student 3: ");
        String name3 = sc.nextLine();

        System.out.print("Enter student ID: ");
        String id3 = sc.nextLine();

        System.out.print("Enter mark: ");
        int mark3 = sc.nextInt();


        Student s3 = new Student(name3, id3, mark3);


        // Display all students
        System.out.println("\n--- Student Records ---");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        // Testing mark update
        System.out.print("\nEnter new mark for Student 1: ");
        int newMark = sc.nextInt();

        boolean result = s1.setMark(newMark);

        if (result) {
            System.out.println("Mark updated successfully.");
        } else {
            System.out.println("Invalid mark. Old mark is kept.");
        }

        System.out.println(s1);

        sc.close();
    }
}