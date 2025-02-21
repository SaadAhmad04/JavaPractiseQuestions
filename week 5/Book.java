import java.util.*;

public class Book {
    int bookId , quantity;
    String title, author, genre;

    public void setDetails(int bookId, String title, String author, String genre , int quantity) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.quantity = quantity; 
    }

    public void getBookDetails(Scanner sc) {
        System.out.print("Enter book id : ");
        bookId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter book title : ");
        title = sc.nextLine();
        System.out.print("Enter book author : ");
        author = sc.nextLine();
        System.out.print("Enter book genre : ");
        genre = sc.nextLine();
        System.out.print("Enter book quantity : ");
        quantity = sc.nextInt();
    }

}