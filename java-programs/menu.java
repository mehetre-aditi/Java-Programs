import javax.swing.*;
import java.awt.event.*;
public class menu implements ActionListener
{
 static JMenuBar mb;
 static JMenu x;
 static JMenuItem m1,m2,m3;
 static JFrame f;
 static Container c;
 public static void main(String s[])
 {
  menu obj=new menu();
  f=new JFrame("Menu demo");
  c=f.getContentPane();
  mb=new JMenuBar();
  x=new JMenu("Color");
  
  m1=new JMenuItem("Red");
  m2=new JMenuItem("Green");
  m3=new JMenuItem("Blue");

  x.add(m1);
  x.add(m2);
  x.add(m3);

  mb.add(x);

  f.setJMenuBar(mb);

  f.setSize(500,500);
  f.setLocationRelativeTo(null);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setVisible(true);

  //x.addActionListener(this);
  m1.addActionListener(obj);
  m2.addActionListener(obj);
  m3.addActionListener(obj);  
 }
 public void actionPerformed(ActionEvent e)
 {
  if(e.getSource()==m1)
  {
   c.setBackground(Color.RED);
  }
  if(e.getSource()==m2)
  {
   c.setBackground(Color.GREEN);
  }
  if(e.getSource()==m3)
  {
   c.setBackground(Color.BLUE);
  }
 }
}