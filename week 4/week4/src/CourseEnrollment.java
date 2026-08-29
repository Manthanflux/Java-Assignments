public class CourseEnrollment {

    public static void main(String[] args) {

        Course c1 = new Course("CS101", "Java Programming", 3);

        System.out.println(c1);

        System.out.println("\nEnrolling students:");

        System.out.println(c1.enroll());
        System.out.println(c1);

        System.out.println(c1.enroll());
        System.out.println(c1);

        System.out.println(c1.enroll());
        System.out.println(c1);

        System.out.println("\nTrying over-enrollment:");
        System.out.println(c1.enroll());

        System.out.println("\nIs course full?");
        System.out.println(c1.isFull());

        System.out.println("\nWithdrawing student:");
        System.out.println(c1.withdraw());
        System.out.println(c1);

        System.out.println("\nWithdrawing students:");
        c1.withdraw();
        c1.withdraw();

        System.out.println(c1);

        System.out.println("\nTrying withdrawal from empty course:");
        System.out.println(c1.withdraw());
    }
}