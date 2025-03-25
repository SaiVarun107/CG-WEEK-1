public class IllegalArgument {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        handleException("JavaCode");
    }
}