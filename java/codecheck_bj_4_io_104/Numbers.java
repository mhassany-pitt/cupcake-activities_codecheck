// TODO: Determine whether a or b do not represent an integer
// by catching the NumberFormatException. If either one is not an integer,
// use the value 0 when computing the sum.

public class Numbers
{
   public int add(String a, String b)
   {
      int x = Integer.parseInt(a);
      int y = Integer.parseInt(b);
      return x + y;
   }
}
