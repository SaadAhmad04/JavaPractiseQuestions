import java.util.*;

public class Library_Catalog_System {
    public static void main(String[] args) {
        int ch;
        Catalog c = new Catalog();
        Book obj1 = new Book();
        obj1.setDetails(101, "Horse and Sea", "William Shakespeare", "Drama", 2);
        c.addBook(obj1);

        Book obj2 = new Book();
        obj2.setDetails(102, "Beauty and the Beast", "Alan Walker", "Comedy", 1);
        c.addBook(obj2);

        ArrayList<Map<Integer, Integer>> userBooks = new ArrayList<>();
        Map<Integer, Integer> book1 = new HashMap<>();
        User u1 = new User();
        book1.put(101, 2);  
        userBooks.add(book1);
        u1.setDetails(1001, "Saad", userBooks);
        c.addUser(u1);

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nPress 1 to add books in the catalog");
            System.out.println("Press 2 to view available books in the catalog");
            System.out.println("Press 3 to add users");
            System.out.println("Press 4 to view available users in the catalog");
            System.out.println("Press 5 to issue book");
            System.out.println("Press 6 to return book");
            System.out.print("\nEnter your choice : ");
            ch = sc.nextInt();
            if (ch == 1) {
                Book b3 = new Book();
                b3.getBookDetails(sc);
                c.addBook(b3);
                c.displayBooks();
            } else if (ch == 2) {
                c.displayBooks();
            } else if(ch == 3){
                User u2 = new User();
                u2.getUserDetails(sc);
                c.addUser(u2);
            } else if(ch == 4){
                c.displayUserBooks();
            }
            else if(ch == 5){
                c.issueBook(sc);
            }
            else if(ch == 6){
                c.returnBook(sc);
            }else{
                System.out.println("Invalid choice");
            }
        } while (ch >= 1 && ch <= 6);
    }
}
