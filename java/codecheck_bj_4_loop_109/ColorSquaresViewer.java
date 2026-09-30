import javax.swing.*;

public class ColorSquaresViewer
{
   public static void main(String[] args)
   {
      String image = 
         "RWCRWWGYYMCYRGWCYGCC" + "YCMYBCCKKKKKKCMWRYMR" +
         "RGWGBWKRBGGGGKRWCYMR" + "CWBWWKCGYCGCMGKCYBGG" +
         "RWBWKYWWCMBRCWYKWCRR" + "WBCKCWBGBRRYCCGMKRRB" +
         "MCWKRMCKWRYYKBRWKBYY" + "MGKCRYKKKWMKKKBGCKMW" +
         "BYKCGBRKCYRRKWGWCKCC" + "CGKMRBMYGBCWYCGWWKMR" +
         "CYKMWGWYCRWYCCCRWKBC" + "RBKYRBYGYYMBCBBMRKMG" +
         "RYKBBMMBCWRGCYCRBKYW" + "WWGKYMGKBGGMKMRBKYCG" +
         "RBGKYCYMKWCKMMYCKBBM" + "WGYGKMYMCKKGCRGKGYYB" +
         "BBBCRKWMWBBGGRKMRCGC" + "MGYMWGKBGGRYCKYBGBWG" +
         "MMMBYWGKKKKKKWRMMRMG" + "YRMYBWGRYWBMRCGCCRCG";
 
      JFrame frame = new JFrame();
      frame.setSize(440, 440);
      frame.setTitle("ColorSquareViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      ColorSquaresComponent component = new ColorSquaresComponent(image, 20, 20, 20);
      frame.add(component);
      frame.setVisible(true);
   }
}
