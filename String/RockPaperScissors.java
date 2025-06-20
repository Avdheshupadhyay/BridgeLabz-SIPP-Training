// Q12: Rock-Paper-Scissors game with stats
import java.util.*;

public class RockPaperScissors {
    static String computerChoice() {
        int c = (int)(Math.random() * 3);
        if (c == 0) return "rock";
        else if (c == 1) return "paper";
        else return "scissors";
    }

    // 0: tie, 1: user, 2: computer
    static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return 1;
        return 2;
    }

    static String[][] getStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0 / games));
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", (compWins * 100.0 / games));
        return stats;
    }

    static void displayStats(String[][] stats) {
        System.out.printf("%-10s%-10s%-15s\n", "Player", "Wins", "Win %");
        for (String[] row : stats) {
            System.out.printf("%-10s%-10s%-15s\n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many games? ");
        int games = sc.nextInt();
        sc.nextLine();
        int userWins = 0, compWins = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("Enter rock, paper, or scissors: ");
            String user = sc.nextLine().toLowerCase();
            String comp = computerChoice();
            int win = winner(user, comp);
            System.out.println("Computer chose: " + comp);
            if (win == 1) { System.out.println("You win!"); userWins++; }
            else if (win == 2) { System.out.println("Computer wins!"); compWins++; }
            else System.out.println("It's a tie!");
        }
        String[][] stats = getStats(userWins, compWins, games);
        displayStats(stats);
        sc.close();
    }
}
