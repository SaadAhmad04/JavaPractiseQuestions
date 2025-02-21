import java.util.*;

public class User {
     int userId;
     String userName;
     ArrayList<Map<Integer , Integer>> myBooks = new ArrayList<Map<Integer , Integer>>();

    public void setDetails(int userId, String userName,ArrayList<Map<Integer , Integer>> myBooks ) {
       this.userId = userId;
       this.userName = userName;
       this.myBooks = myBooks;
    }

    public void getUserDetails(Scanner sc) {
        System.out.print("Enter user id : ");
        userId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter user name : ");
        userName = sc.nextLine();
    }
}
