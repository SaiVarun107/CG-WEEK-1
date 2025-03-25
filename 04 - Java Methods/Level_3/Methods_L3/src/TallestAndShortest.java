import java.util.Random;
public class TallestAndShortest {
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250
        }
        return heights;
    }
    public static int sumHeights(int[] arr) {
        int sum = 0;
        for (int h : arr) {
            sum += h;
        }
        return sum;
    }
    public static double meanHeight(int[] arr) {
        return (double) sumHeights(arr) / arr.length;
    }
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min)
                min = h;
        }
        return min;
    }
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max)
                max = h;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.print("Player Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + meanHeight(heights) + " cm");
    }
}
