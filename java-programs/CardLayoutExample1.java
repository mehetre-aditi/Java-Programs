import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CardLayoutExample1 extends JFrame implements ActionListener
{
 CardLayout crd;
 JButton btn1,btn2,btn3;
 Container cPane;
 CardLayoutExample1()
 {
  cPane=this.getContentPane();
  crd=new CardLayout();
  cPane.setLayout(crd);
  btn1=new JButton("Apple"); 
  btn2=new JButton("Boy");
  btn3=new JButton("Cat");
  btn1.addActionListener(this);
  btn2.addActionListener(this);
  btn3.addActionListener(this);  
  cPane.add("a",btn1);
  cPane.add("b",btn2);
  cPane.add("c",btn3);
 }
 public void actionPerformed(ActionEvent e)
 {
  crd.next(cPane);
 }
 public static void main(String args[])
 {
  CardLayoutExample1 crd1=new CardLayoutExample1();
  crd1.setSize(300,300);
  crd1.setVisible(true);
  crd1.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
}