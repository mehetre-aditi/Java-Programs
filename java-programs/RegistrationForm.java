import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l4,l5,msg;
 JTextField t1,t2;
 JRadioButton m,f;
 JComboBox d,mon,y;
 JTextArea ta,screen;
 JCheckBox terms;
 JButton submit;
 MyFrame()
 {
  setTitle("Registration form");
  setSize(700,500);
  setLocation(150,200);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Container c=this.getContentPane();
  c.setLayout(null);
  
  l1=new JLabel("Name");
  l1.setBounds(20,50,100,20);
  c.add(l1);

  t1=new JTextField();
  t1.setBounds(130,50,100,20);
  c.add(t1);

  l2=new JLabel("Mobile");
  l2.setBounds(20,100,100,20);
  c.add(l2);

  t2=new JTextField();
  t2.setBounds(130,100,100,20);
  c.add(t2);

  l3=new JLabel("Gender");
  l3.setBounds(20,150,100,20);
  c.add(l3);

  m=new JRadioButton("Male");
  f=new JRadioButton("Female");
  m.setBounds(130,150,80,20);
  f.setBounds(220,150,80,20);
  m.setSelected(true);
  c.add(m);
  c.add(f);
  ButtonGroup gen=new ButtonGroup();
  gen.add(m);
  gen.add(f);
  
  l4=new JLabel("DOB");
  l4.setBounds(20,200,100,20);
  c.add(l4);
  String day[]=
  {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28",
   "29","30","31"};
  String mon1[]=
  {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
  String yr[]=
  {"2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002",
   "2001","2000","1999","1998"};
  d=new JComboBox(day);
  mon=new JComboBox(mon1);
  y=new JComboBox(yr);
  d.setBounds(130,200,50,20);
  mon.setBounds(190,200,50,20);
  y.setBounds(250,200,50,20);
  
  c.add(d);
  c.add(mon);
  c.add(y);

  l5=new JLabel("Address");
  l5.setBounds(20,250,100,20);
  c.add(l5);

  ta=new JTextArea();
  ta.setBounds(130,240,200,50);
  c.add(ta);

  terms=new JCheckBox("Please accept terms and conditions");
  terms.setBounds(50,300,300,20);
  c.add(terms);

  submit=new JButton("Submit");
  submit.setBounds(150,350,80,20);
  c.add(submit);
  submit.addActionListener(this);
  
  screen=new JTextArea();
  screen.setBounds(350,50,300,300);
  c.add(screen);

  msg=new JLabel("");
  msg.setBounds(20,400,250,20);
  c.add(msg);

  setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  if(terms.isSelected())
  {
   msg.setText("Registration is Successful");
   String name=t1.getText();
   String mo=t2.getText();
   String gender="male";
   if(f.isSelected())
   {
    gender="female";
   }
   String dob=d.getSelectedItem()+"-"+mon.getSelectedItem()+"-"+y.getSelectedItem();
   String add=ta.getText();
   screen.setText("Name: "+name+"\n"+"Mobile: "+mo+"\n"+"Gender: "+gender+"\n"+"DOB: "+dob+"\n"+"Address: "+add); 
  }
  else
  {
   msg.setText("Please accept terms and conditions before clicking on submit button");
   screen.setText(" ");
  }
 }
}
class RegistrationForm
{
 public static void main(String s[])
 {
  MyFrame f1=new MyFrame();
 }
}  
    

  