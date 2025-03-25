import java.util.Scanner;
public class RockPaperScissorsBeginner {
    public static String getComputerChoice() {
        int num = (int)(Math.random() * 3);
        if (num == 0) return "rock";
        else if (num == 1) return "paper";
        else return "scissors";
    }
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if (user.equals("rock") && computer.equals("scissors")) return "User";
        if (user.equals("paper") && computer.equals("rock")) return "User";
        if (user.equals("scissors") && computer.equals("paper")) return "User";
        return "Computer";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        String[] userChoices = new String[n];
        String[] compChoices = new String[n];
        String[] winners = new String[n];
        int userWins = 0;
        int compWins = 0;
        int draws = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);
            userChoices[i] = user;
            compChoices[i] = comp;
            winners[i] = winner;
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;
        }
        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("----------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + userChoices[i] + "\t" + compChoices[i] + "\t\t" + winners[i]);
        }
        System.out.println("\nUser Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);
        double userPercent = (userWins * 100.0) / n;
        double compPercent = (compWins * 100.0) / n;
        System.out.println("User Win %: " + String.format("%.2f", userPercent));
        System.out.println("Computer Win %: " + String.format("%.2f", compPercent));
        sc.close();
    }
}
