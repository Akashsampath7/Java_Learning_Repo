import java.util.*;

public class Book implements Comparable<Book> {
    int id;
    String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // order by id
    public int compareTo(Book b) {
        return this.id - b.id;
    }

    public String toString() {
        return id + " " + title;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(3, "C Programming"));
        books.add(new Book(1, "Java Basics"));
        books.add(new Book(2, "Python Intro"));

        Collections.sort(books); // uses compareTo()

        for (Book b : books) {
            System.out.println(b);
        }
    }
}