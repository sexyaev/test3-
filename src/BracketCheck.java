import java.util.Scanner;
import java.util.Stack;


public class BracketCheck {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();

                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }


            }
        }
        return stack.isEmpty();
    }

public static void main (String[] agrs){

    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    boolean Validation = isValid(str);

    if (Validation){

    System.out.println("Скобки расставлены правильно");
    } else {
        System.out.println("Скобки расставлены неправильно");
    }





}








}