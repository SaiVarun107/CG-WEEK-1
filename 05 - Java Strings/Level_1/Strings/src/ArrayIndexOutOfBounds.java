public class ArrayIndexOutOfBounds {
    public static void generateException(String[] names) {
        System.out.println(names[10]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println(names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        handleException(names);
    }
}
