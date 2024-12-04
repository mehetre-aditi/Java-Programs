import javax.swing.*;
public class OptionPaneExample
{
 JFrame f;
 OptionPaneExample()
 {
  f=new JFrame();
  JOptionPane.showMessageDialog(f,"Hello,Welcome to global soft tech");
 }
 public static void main(String args[])
 {
  new OptionPaneExample();
 }
}