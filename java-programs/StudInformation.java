import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StudInformation extends JFrame implements ActionListener
{
 //input components of personal information 
 JTabbedPane tp=new JTabbedPane();
 JPanel p1=new JPanel();
 JLabel name=new JLabel("Name") ;
 JLabel dob=new JLabel("Date Of Birth");
 JLabel add=new JLabel("Address");
 JLabel mono=new JLabel("Mobile No");
 JLabel email=new JLabel("Email Address");
 JLabel age=new JLabel("Age");
 JLabel gen=new JLabel("Gender");
 JTextField jtfname=new JTextField();
 JTextField jtfage=new JTextField();
 JTextField jtfmono=new JTextField();
 JTextField jtfemail=new JTextField();
 JTextArea jtaadd=new JTextArea();
 JRadioButton m;
 JRadioButton f;
 JButton sub;
 JButton next;
 JComboBox d;
 JComboBox mo;
 JComboBox y;
 JLabel m1;
 
 //input components of Academic information 
 JPanel p2=new JPanel();
 JLabel clg=new JLabel("College Name");
 JLabel deg=new JLabel("Degree");
 JLabel branch=new JLabel("Branch");
 JLabel clgadd=new JLabel("College Address");
 JTextField jtfclg=new JTextField();
 JTextField jtfdeg=new JTextField();
 JTextField jtfbranch=new JTextField();
 JTextArea jtaclgadd=new JTextArea();
 JButton sub1;
 JButton next1;
 JLabel m2;

 //input components of program
 JPanel p3=new JPanel();
 JLabel no1=new JLabel("First Number");
 JLabel no2=new JLabel("Second Number");
 JLabel sum=new JLabel("Addition");
 JTextField jtfn1=new JTextField();
 JTextField jtfn2=new JTextField();
 JTextField jtfresult=new JTextField();
 JButton ad;
 JButton clr;

 StudInformation()
 {
  setTitle("Student Information");
  setSize(600,600);
  setLocation(100,150);
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  
  tp.setBounds(5,5,550,550);
  this.add(tp);
  p1.setLayout(null);
  p1.setBounds(5,5,550,550);
  tp.add("Pesonal Info",p1);
  
  //personal info
  name.setBounds(50,50,100,20);
  p1.add(name);

  jtfname.setBounds(170,50,100,20);
  p1.add(jtfname);

  dob.setBounds(50,100,100,20);
  p1.add(dob);

  String day[]=
  {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28",
   "29","30","31"};
  String month[]=
  {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
  String year[]=
  {"2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002",
   "2001","2000","1999","1998"};
  d=new JComboBox(day);
  mo=new JComboBox(month);
  y=new JComboBox(year);
  d.setBounds(170,100,70,20);
  mo.setBounds(250,100,70,20);
  y.setBounds(330,100,70,20);
  p1.add(d);
  p1.add(mo);
  p1.add(y);

  add.setBounds(50,150,70,20);
  p1.add(add);

  jtaadd.setBounds(170,150,200,30);
  p1.add(jtaadd);

  mono.setBounds(50,200,100,20);
  p1.add(mono);

  jtfmono.setBounds(170,200,100,20);
  p1.add(jtfmono);

  email.setBounds(50,250,100,20);
  p1.add(email);

  jtfemail.setBounds(170,250,200,20);
  p1.add(jtfemail);

  age.setBounds(50,300,100,20);
  p1.add(age);

  jtfage.setBounds(170,300,100,20);
  p1.add(jtfage);

  gen.setBounds(50,350,100,20);
  p1.add(gen);

  m=new JRadioButton("Male");
  m.setBounds(170,350,100,20);
  m.setSelected(true);
  p1.add(m);

  f=new JRadioButton("Female");
  f.setBounds(300,350,100,20);
  f.setSelected(false);
  p1.add(f);

  ButtonGroup bg=new ButtonGroup();
  bg.add(m);
  bg.add(f);
  
  sub=new JButton("Submit");
  sub.setBounds(100,400,120,30);
  p1.add(sub);

  next=new JButton("Next");
  next.setBounds(250,400,120,30);
  p1.add(next);

  m1=new JLabel("");
  m1.setBounds(50,450,200,20);
  p1.add(m1);

  p2.setLayout(null);
  p2.setBounds(5,5,550,550);
  tp.add("Academic Info",p2);
  
  //academic info
  clg.setBounds(50,50,100,20);
  p2.add(clg);

  jtfclg.setBounds(170,50,100,20);
  p2.add(jtfclg);

  deg.setBounds(50,100,100,20);
  p2.add(deg);

  jtfdeg.setBounds(170,100,100,20);
  p2.add(jtfdeg);

  branch.setBounds(50,150,100,20);
  p2.add(branch);

  jtfbranch.setBounds(170,150,100,20);
  p2.add(jtfbranch);

  clgadd.setBounds(50,200,100,20);
  p2.add(clgadd);

  jtaclgadd.setBounds(170,200,200,30);
  p2.add(jtaclgadd);

  sub1=new JButton("Submit");
  sub1.setBounds(100,400,120,30);
  p2.add(sub1);

  next1=new JButton("Next");
  next1.setBounds(250,400,120,30);
  p2.add(next1);

  m2=new JLabel("");
  m2.setBounds(50,450,200,20);
  p2.add(m2);

  p3.setLayout(null);
  p3.setBounds(5,5,550,550);
  tp.add("My Program",p3);

  //my program
  no1.setBounds(50,50,100,20);
  p3.add(no1);

  jtfn1.setBounds(170,50,100,20);
  p3.add(jtfn1);

  no2.setBounds(50,100,100,20);
  p3.add(no2);

  jtfn2.setBounds(170,100,100,20);
  p3.add(jtfn2);
 
  sum.setBounds(50,150,100,20);
  p3.add(sum);
 
  jtfresult.setBounds(170,150,100,20);
  p3.add(jtfresult);

  ad=new JButton("Add");
  ad.setBounds(100,250,70,30);
  p3.add(ad);

  clr=new JButton("Clear");
  clr.setBounds(200,250,70,30);
  p3.add(clr);

  ad.addActionListener(this);
  clr.addActionListener(this);
  sub.addActionListener(this);
  next.addActionListener(this);
  sub1.addActionListener(this);
  next1.addActionListener(this);

  setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  if(jtfname.getText().length()<1 || jtfmono.getText().length()<1 || jtfemail.getText().length()<1 || jtfage.getText().length()<1 ||
     jtaadd.getText().length()<1 || jtfclg.getText().length()<1 || jtfdeg.getText().length()<1 || jtfbranch.getText().length()<1 ||
     jtaclgadd.getText().length()<1 )
  {
   m1.setText("Please Fill all the information");
   m2.setText("Please Fill all the information");
  }
  int a,b,c;
  a=Integer.parseInt(jtfn1.getText());
  b=Integer.parseInt(jtfn2.getText());
  if(e.getSource()==ad)
  {
   c=a+b;
   jtfresult.setText(String.valueOf(c));
  }
  else
  {
   jtfn1.setText(""); 
   jtfn2.setText(""); 
   jtfresult.setText("");
   repaint();
   jtfn1.requestFocus();
  }
 }
 public static void main(String args[])
 {
  new StudInformation();
 }
}
  


  
  
 