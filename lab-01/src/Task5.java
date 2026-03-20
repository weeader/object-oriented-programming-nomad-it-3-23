import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book("1984", "George Orwell"));
        library.add(new Book("Animal Farm", "George Orwell"));
        library.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling"));
        library.add(new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling"));

        String searchAuthor = scanner.nextLine();
        boolean found = false;
        for (Book book : library) {
            if (book.getAuthor().equalsIgnoreCase(searchAuthor)) {
                System.out.println(book.getTitle());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found by " + searchAuthor);
        }

        scanner.close();
    }
}