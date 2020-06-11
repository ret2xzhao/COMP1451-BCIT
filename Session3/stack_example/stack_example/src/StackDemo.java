/*
Stack collection implements Last-In Fist-Out behavior on items stored within it.
 */
import java.util.Stack;

public class StackDemo {
    static String newLine = System.getProperty("line.separator");

    public static void main(String[] args) {

        System.out.println(newLine + "Stack in Java" + newLine);
        System.out.println("-----------------------" + newLine);
        System.out.println("Adding items to the Stack1" + newLine);
        // Creatin stack object
        Stack<String> stack = new Stack<String>();

        // you add elements to stack using push method
        stack.push("Java");
        stack.push(".NET");

        stack.push("Javascript");
        stack.push("HTML5");
        stack.push("Hadoop");
        System.out.println(newLine + "Items in the stack..." + stack + newLine);
        System.out.println("-----------------------" + newLine);

        // you remove elements from the stack using pop method
        // pop would remove the last element and would return it
        // its last-in first-out behavior
        // so here it would return hadoop
        System.out.println("removing from stack, using pop method - "
            + stack.pop() + newLine);
        // another pop would return HTML5
        System.out.println("removing from stack, using pop method - "
            + stack.pop() + newLine);
        System.out.println("-----------------------" + newLine);

        // Peek returns the top element in the stack but does not remove it
        // so here after html5 and hadoop are returned, the top item is
        // Javascript
		System.out
            .println("returning the top element in the stack using peek method - "
                + stack.peek() + newLine);
	}
}