import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        //Creating an ArrayList to store the Book objects
        ArrayList<Book> books = new ArrayList<>();

        //Creating a Scanner object to read the user's input
        Scanner scanner = new Scanner(System.in);

        //Using a while loop to collect the inputs from the user until finished
        while (true) {
            //Asking the user for the book title
            System.out.print("Enter the title of the book (or press enter to stop): ");
            String title = scanner.nextLine();

            //Checking if the user's input is empty and if so breaking the loop
            if (title.isEmpty()) {
                break;
            }

            //Asking the user for the number of pages
            System.out.print("Enter the number of pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            //Asking the user for the publication year
            System.out.print("Enter the publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            //Creating Book objects using the different constructors
            books.add(new Book(title, pages, publicationYear));  // Constructor with all attributes
            books.add(new Book(title));                            // Constructor with only title
            books.add(new Book(pages));                            // Constructor with only pages
            books.add(new Book(publicationYear, true));            // Constructor with only publication year
            books.add(new Book());                                 // Default constructor
        }

        //Asking the user what should be printed once the loop ends
        System.out.print("What information would you like to print? (type 'everything' or 'name'): ");
        String printOption = scanner.nextLine().toLowerCase();

        //Printing the book details based on the user's choice
        if (printOption.equals("everything")) {
            System.out.println("Book Details:");
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (printOption.equals("name")) {
            System.out.println("Book Titles:");
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        } else {
            System.out.println("Invalid option. Please enter 'everything' or 'name'.");
        }
    }
}
