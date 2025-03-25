public class NumberFormat {
    public static void generateException(String input) {
        int num = Integer.parseInt(input);
        System.out.println(num);
    }
    public static void handleException(String input) {
        try {
            int num = Integer.parseInt(input);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        handleException("abc123");
    }
}