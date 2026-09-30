import java.util.Stack;

public class ExpressionChecker
{
   public boolean checkParentheses(String expression)
   {
      Stack<String> stk = new Stack<String>();
      for (int i = 0; i < expression.length(); i++)
      {
         String part = expression.substring(i, i + 1);
         stk.push(part);
         // TODO: Complete this loop
      }
      
      while (!stk.isEmpty())
      {
         String part = stk.pop();
         // TODO: Complete this loop
      }
      
      // TODO: Complete this statement
      return ...;
   }
}
