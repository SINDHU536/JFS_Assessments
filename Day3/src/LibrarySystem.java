import java.util.Random;

public class LibrarySystem {

    // Utility class to generate random ID
    static class Utility {
        public static int generateId() {
            Random rand = new Random();
            return 1000 + rand.nextInt(9000); // Random 4-digit ID
        }
    }

    // Book class
    static class Book {
        private String title;
        private String author;
        private int bookId;

        public Book(String title, String author, int bookId) {
            this.title = title;
            this.author = author;
            this.bookId = bookId;
        }

        public void displayBookDetails() {
            System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author);
        }
    }

    // Member class
    static class Member {
        private String name;
        private int memberId;

        public Member(String name, int memberId) {
            this.name = name;
            this.memberId = memberId;
        }

        public void displayMemberDetails() {
            System.out.println("Member ID: " + memberId + ", Name: " + name);
        }
    }

    // Main method to run the system
    public static void main(String[] args) {
        // Using static import for generateId() (direct access to method)
        int bookId = Utility.generateId();  // Generate a random book ID
        int memberId = Utility.generateId(); // Generate a random member ID

        // Creating Book and Member objects
        Book book = new Book("The Alchemist", "Paulo Coelho", bookId);
        Member member = new Member("Alice", memberId);

        // Displaying details of Book and Member
        book.displayBookDetails();
        member.displayMemberDetails();
    }
}
