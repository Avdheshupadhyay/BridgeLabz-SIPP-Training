import java.util.ArrayList;
import java.util.Scanner;

class User {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

public class SocialMediaFriendConnections {
    private User head;

    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        newUser.next = head;
        head = newUser;
    }

    public User searchById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    public User searchByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriendConnection(int userId1, int userId2) {
        User u1 = searchById(userId1);
        User u2 = searchById(userId2);
        if (u1 == null || u2 == null) return;
        if (!u1.friendIds.contains(userId2)) u1.friendIds.add(userId2);
        if (!u2.friendIds.contains(userId1)) u2.friendIds.add(userId1);
    }

    public void removeFriendConnection(int userId1, int userId2) {
        User u1 = searchById(userId1);
        User u2 = searchById(userId2);
        if (u1 == null || u2 == null) return;
        u1.friendIds.remove((Integer) userId2);
        u2.friendIds.remove((Integer) userId1);
    }

    public void displayFriends(int userId) {
        User user = searchById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        System.out.print("Friends of " + user.name + ": ");
        for (int fid : user.friendIds) {
            User f = searchById(fid);
            if (f != null) System.out.print(f.name + " (" + fid + ") ");
        }
        System.out.println();
    }

    public void findMutualFriends(int userId1, int userId2) {
        User u1 = searchById(userId1);
        User u2 = searchById(userId2);
        if (u1 == null || u2 == null) {
            System.out.println("User(s) not found.");
            return;
        }
        System.out.print("Mutual friends: ");
        for (int fid : u1.friendIds) {
            if (u2.friendIds.contains(fid)) {
                User f = searchById(fid);
                if (f != null) System.out.print(f.name + " (" + fid + ") ");
            }
        }
        System.out.println();
    }

    public void countFriendsForEachUser() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " (" + temp.userId + ") has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaFriendConnections smfc = new SocialMediaFriendConnections();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Social Media Friend Connections ---");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend Connection");
            System.out.println("3. Remove Friend Connection");
            System.out.println("4. Find Mutual Friends");
            System.out.println("5. Display Friends of User");
            System.out.println("6. Search by Name");
            System.out.println("7. Search by User ID");
            System.out.println("8. Count Friends for Each User");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("User ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    smfc.addUser(uid, name, age);
                    break;
                case 2:
                    System.out.print("User ID 1: ");
                    int u1 = sc.nextInt();
                    System.out.print("User ID 2: ");
                    int u2 = sc.nextInt();
                    smfc.addFriendConnection(u1, u2);
                    break;
                case 3:
                    System.out.print("User ID 1: ");
                    int ru1 = sc.nextInt();
                    System.out.print("User ID 2: ");
                    int ru2 = sc.nextInt();
                    smfc.removeFriendConnection(ru1, ru2);
                    break;
                case 4:
                    System.out.print("User ID 1: ");
                    int m1 = sc.nextInt();
                    System.out.print("User ID 2: ");
                    int m2 = sc.nextInt();
                    smfc.findMutualFriends(m1, m2);
                    break;
                case 5:
                    System.out.print("User ID: ");
                    int duid = sc.nextInt();
                    smfc.displayFriends(duid);
                    break;
                case 6:
                    System.out.print("Enter Name: ");
                    String sname = sc.nextLine();
                    User foundN = smfc.searchByName(sname);
                    if (foundN != null) System.out.println("Found: " + foundN.name + ", Age: " + foundN.age + ", ID: " + foundN.userId);
                    else System.out.println("User not found.");
                    break;
                case 7:
                    System.out.print("Enter User ID: ");
                    int suid = sc.nextInt();
                    User foundU = smfc.searchById(suid);
                    if (foundU != null) System.out.println("Found: " + foundU.name + ", Age: " + foundU.age + ", ID: " + foundU.userId);
                    else System.out.println("User not found.");
                    break;
                case 8:
                    smfc.countFriendsForEachUser();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}
