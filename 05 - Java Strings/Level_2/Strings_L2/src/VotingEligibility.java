import java.util.Random;
public class VotingEligibility {
    public static int[] generateAges(int count) {
        int[] ages = new int[count];
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            ages[i] = rand.nextInt(90) + 10;  // generates 2-digit number (10–99)
        }
        return ages;
    }
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }
    public static void displayTable(String[][] table) {
        System.out.println("\nStudent\tAge\tCan Vote?");
        System.out.println("--------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println((i + 1) + "\t" + table[i][0] + "\t" + table[i][1]);
        }
    }
    public static void main(String[] args) {
        int[] studentAges = generateAges(10);
        String[][] eligibilityTable = checkEligibility(studentAges);
        displayTable(eligibilityTable);
    }
}