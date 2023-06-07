import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Minecraft");
        stack.push("Jogo Um");
        stack.push("Jogo dois");
        stack.push("Jogo tres");

        System.out.println(stack.empty());
        System.out.println(stack);

        stack.pop();

        System.out.println(stack);
    }
}