import java.util.Stack;
import java.util.Scanner;
public class StackSwap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(in.nextInt());
        stack1.push(in.nextInt());
        stack1.push(in.nextInt());



        System.out.println("Стек 1 до перестановки: " + stack1);
        System.out.println("Стек 2 до перестановки: " + stack2);


        while (!stack1.isEmpty()) {

            stack2.push(stack1.pop());

        }

        System.out.println("Стек 1 после перестановки: " + stack1);
        System.out.println("Стек 2 после перестановки: " + stack2);


    }




}

