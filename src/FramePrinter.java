import java.util.List;

public class FramePrinter {
    public static void main(String[] args) {
        List<String> words = List.of("Hello", "World", "in", "a", "frame");
        printInFrame(words);
    }
    public static void printInFrame(List<String> words) {
        int maxLength = 0;
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }
        printBorder(maxLength);
        for (String word : words) {
            System.out.print("* ");
            System.out.print(word);
            for (int i = 0; i < maxLength - word.length(); i++) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }
        printBorder(maxLength);
    }
    private static void printBorder(int length) {
        System.out.print("*");
        for (int i = 0; i < length + 2; i++) {
            System.out.print("*");
        }
        System.out.println("*");
    }
}