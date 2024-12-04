import javax.swing.*;
import javax.swing.UIManager;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener
{
 Container c;
 JLabel l1,l2,l3;
 JTextField uname;
 JPasswordField pass;
 JButton btn;
 MyFrame()
 {
  setTitle("LoginForm");
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setSize(400,300);
  setLocation(300,300);
  setBackground(Color.yellow);
  setResizable(false);
  c=getContentPane();
  c.setLayout(null);
  
  l1=new JLabel("User Name");
  l2=new JLabel("Password");
  l3=new JLabel("Click the button");
  l1.setBounds(30,50,100,20);
  l2.setBounds(30,100,100,20);
  l3.setBounds(50,200,250,40);
  c.add(l1);
  c.add(l2);
  c.add(l3);
  uname=new JTextField();
  uname.setBounds(120,50,120,40);
  c.add(uname);
  pass=new JPasswordField();
  pass.setBounds(120,100,120,40);
  c.add(pass);
  btn=new JButton("Login");
  btn.setBounds(100,150,80,50);
  c.add(btn);
  btn.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e) 
 {
  String s1=uname.getText().trim();
  String s2=pass.getText().trim(); 
  
  if(s1.equals("global")&& s2.equals("soft123"))
  {
   l3.setText("Login Successful......");
  }
  else
  {
   l3.setText("Login failed......");
  }
  System.out.println("username="+uname.getText());
  System.out.println("Password="+pass.getText());
 }
}
class LginForm
{
 public static void main(String s[])throws Exception
 {
  MyFrame m=new MyFrame();
  m.show();
 }
}