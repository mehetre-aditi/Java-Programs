import java.awt.*;
import javax.swing.*;
class Add extends JFrame
{
 JPanel p;
 JLabel l1,l2;
 JTextField t1,t2;
 JButton b;
 Add()
 {
  p=new JPanel();
  l1=new JLabel("Enter first number");
  l2=new JLabel("Enter second number");
  b=new JButton("add");
  t1=new JTextField(10);
  t2=new JTextField(10);
  p.add(l1);
  p.add(t1);
  p.add(l2);
  p.add(t2);
  p.add(b);
  add(p);
  setSize(300,400);
  setLayout(new GridLayout(1,1));
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public static void main(String args[])
 {
  new Add();
 }
}
