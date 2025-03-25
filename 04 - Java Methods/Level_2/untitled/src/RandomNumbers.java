import java.util.Random;
public class RandomNumbers {
    public static int[] GenerateRandomNumbers(int size) {
        int[] numbers = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + rand.nextInt(9000);
        }
        return numbers;
    }
    public static void printNumbers(int[] numbers) {
        System.out.print("Random Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void StatsofNumber(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
    public static void main(String[] args) {
        int[] randomNumbers = GenerateRandomNumbers(4);
        printNumbers(randomNumbers);
        StatsofNumber(randomNumbers);
    }
}
