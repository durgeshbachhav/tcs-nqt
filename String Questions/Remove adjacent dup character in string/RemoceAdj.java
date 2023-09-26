import java.util.*;

public class RemoceAdj {
     public static void main(String[] args) {
          
          String str = "aaabckdfaa";
          System.err.println(adRemove(str));

     }


     public static String adRemove(String str){
          Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            if (stack.isEmpty() || ch != stack.peek()) {
                stack.push(ch);
            } else {
                while (!stack.isEmpty() && ch == stack.peek()) {
                    stack.pop();
                }
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()); // Insert at the beginning to maintain order
        }
        
        return result.toString();
     }
}
