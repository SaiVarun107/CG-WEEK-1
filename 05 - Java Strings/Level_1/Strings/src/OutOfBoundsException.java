public class OutOfBoundsException {
    public static void generateException(String text) {
        System.out.println(text.charAt(100));
    }
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        handleException("Hello");
    }
}