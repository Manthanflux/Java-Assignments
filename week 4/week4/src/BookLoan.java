public class BookLoan {

    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "James", "B101");
        Book b2 = new Book("Data Structures", "Robert", "B102");

        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\nBorrowing first book:");
        System.out.println(b1.borrowBook());

        System.out.println("Trying to borrow again:");
        System.out.println(b1.borrowBook());

        System.out.println("\nReturning first book:");
        System.out.println(b1.returnBook());

        System.out.println("Trying to return again:");
        System.out.println(b1.returnBook());

        System.out.println("\nIndependent books:");
        System.out.println(b1);
        System.out.println(b2);
    }
}