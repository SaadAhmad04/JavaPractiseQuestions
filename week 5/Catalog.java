import java.util.*;

public class Catalog {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public void addBook(Book b) {
        boolean found = false;
        for (Book ab : books) {
            if (ab.bookId == b.bookId) {
                found = true;
                ab.quantity += b.quantity;
            }
        }
        if(!found){
            books.add(b);
        }
    }

    public void displayBooks() {
        System.out.println("Total available books = " + books.size());
        for (Book ab : books) {
            System.out.println("Book ID : " + ab.bookId + "\tAuthor : " + ab.author + "\tTitle : " + ab.title
                    + "\tGenre : " + ab.genre + "\tAvailable : " + ab.quantity);
        }
    }

    public void addUser(User u) {
        users.add(u);
    }

    public void displayUserBooks() {
        for (User u : users) {
            System.out.println(u.userName + "'s Books:");
            if (u.myBooks == null || u.myBooks.isEmpty()) {
                System.out.println(u.userName + " has borrowed no books");
            } else {
                for (Map<Integer, Integer> book : u.myBooks) {
                    for (Map.Entry<Integer, Integer> entry : book.entrySet()) {
                        System.out.println("Book ID: " + entry.getKey() + " \tQuantity: " + entry.getValue());
                    }
                }
            }
            System.out.println();
        }
    }

    public void issueBook(Scanner sc) {
        System.out.print("Enter your id : ");
        int id = sc.nextInt();
        boolean found = false;
        for (User u : users) {
            if (u.userId == id) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("User not found");
        } else {
            System.out.println("How do you want to search the book ?");
            System.out.println("Press 1 to search by id");
            System.out.println("Press 2 to search by name");
            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();
            Book temp = searchBook(ch, sc);
            if (temp != null) {
                System.out.println("\nBook available");
                System.out.println("Book ID : " + temp.bookId + "\tAuthor : " + temp.author + "\tTitle : " + temp.title
                        + "\tGenre : " + temp.genre);
                System.out.print("\nAre you sure want to issue this book ? (Y/N) ");
                char sure = sc.next().charAt(0);
                if (sure == 'Y' || sure == 'y') {
                    Map<Integer, Integer> book = new HashMap<>();
                    book.put(temp.bookId, 1);
                    for (User u : users) {
                        if (u.userId == id) {
                            boolean bookFound = false;
                            for (Map<Integer, Integer> current : u.myBooks) {
                                for (Map.Entry<Integer, Integer> entry : current.entrySet()) {
                                    if (entry.getKey() == temp.bookId) {
                                        bookFound = true;
                                        entry.setValue(entry.getValue() + 1);
                                    }
                                }
                            }
                            if (!bookFound) {
                                u.myBooks.add(book);
                            }
                        }
                    }
                    for (Book ab : books) {
                        if (ab.bookId == temp.bookId) {
                            ab.quantity -= 1;
                        }
                    }
                    System.out.println("\nBook issued");
                    System.out.println("Your books");
                    for (User u : users) {
                        if (u.userId == id) {
                            for (Map<Integer, Integer> current : u.myBooks) {
                                for (Map.Entry<Integer, Integer> entry : current.entrySet()) {
                                    System.out
                                            .println("Book ID: " + entry.getKey() + " \tQuantity: " + entry.getValue());
                                }
                            }
                        }
                        System.out.println();
                    }
                    displayBooks();
                }
            } else {
                System.out.println("Book not found");
            }
        }
    }

    public Book searchBook(int ch, Scanner sc) {
        if (ch == 1) {
            System.out.print("\nEnter book id : ");
            int bId = sc.nextInt();
            for (Book ab : books) {
                if (ab.bookId == bId) {
                    return ab;
                }
            }
            return null;
        } else if (ch == 2) {
            sc.nextLine();
            System.out.print("\nEnter book name : ");
            String bookTitle = sc.nextLine();
            for (Book ab : books) {
                if (ab.title.equalsIgnoreCase(bookTitle)) {
                    return ab;
                }
            }
            return null;
        } else {
            System.out.println("Invalid choice");
            return null;
        }
    }

    public void returnBook(Scanner sc) {
        System.out.print("Enter your id : ");
        int id = sc.nextInt();
        boolean found = false;
        for (User u : users) {
            if (u.userId == id) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("User not found");
        } else {
            System.out.println("Enter the book id you want to return : ");
            int bId = sc.nextInt();
            for (Book ab : books) {
                if (ab.bookId == bId) {
                    ab.quantity += 1;
                }
            }
            for (User u : users) {
                if (u.userId == id) {
                    for (Map<Integer, Integer> book : u.myBooks) {
                        for (Map.Entry<Integer, Integer> entry : book.entrySet()) {
                            entry.setValue(entry.getValue() - 1);
                        }
                    }
                }
            }
            displayUserBooks();
            displayBooks();
        }
    }
}
