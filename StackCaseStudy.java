import java.util.Stack;

public class StackCaseStudy {
    public static void main(String[] args) {
        Stack<String> commandStack = new Stack<>();

        commandStack.push("Type Data");
        commandStack.push("Type Structure");
        commandStack.push("Delete Structure");
        commandStack.push("Type Algorithm");
        commandStack.push("Type Java");
        
        System.out.println("1-2. All commands in Stack (Bottom -> Top): " + commandStack);
    
        System.out.println("\n--- Executing Undo 2 Times ---");
        for (int i = 1; i <= 2; i++) {

            if (!commandStack.isEmpty()) {
                String undoneCommand = commandStack.pop();
                System.out.println("Undo #" + i + ": Cancelled command [" + undoneCommand + "]");
            } else {
                System.out.println("Cannot undo because the Stack is empty.");
            }
        }
        
        System.out.println("\n5. Stack status after Undo: " + commandStack);
    }
}