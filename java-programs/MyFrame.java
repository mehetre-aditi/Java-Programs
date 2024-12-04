import javax.swing.*;
import java.awt.*;
class MyFrame
{
 public static void main(String s[])
 {
  JFrame jf=new JFrame();
  jf.setVisible(true);
  jf.setTitle("This is my Swing Program");
  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  jf.setBounds(300,150,400,300);
  ImageIcon ico=new ImageIcon("flower");
  jf.setResizable(true);
  Container con=jf.getContentPane();
  con.setBackground(Color.pink);
 }
}