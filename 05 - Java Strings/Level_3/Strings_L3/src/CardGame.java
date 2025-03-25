import java.util.Scanner;
public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        for (int i = 0; i < numOfCards; i++) {
            int randomIndex = i + (int)(Math.random() * (numOfCards - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();
        if (players * cardsPerPlayer > numOfCards) {
            System.out.println("Not enough cards to distribute.");
            return;
        }
        String[][] playerCards = new String[players][cardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println("  " + playerCards[i][j]);
            }
            System.out.println();
        }
    }
}
