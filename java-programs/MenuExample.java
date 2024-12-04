import javax.swing.*;
class MenuExample
{
 JMenu file,edit;
 JMenuItem i1,i2,i3,i4,i5;
 JSeparator sep1,sep2;
 MenuExample()
 {
  JFrame f=new JFrame("Menu and MenuItem Example");
  JMenuBar mb=new JMenuBar();
  file=new JMenu("File");
  edit=new JMenu("Edit");
  i1=new JMenuItem("New");
  i2=new JMenuItem("Open");
  sep1=new JSeparator();
  sep2=new JSeparator();
  i3=new JMenuItem("Exit");
  i4=new JMenuItem("Copy");
  i5=new JMenuItem("Paste");
  file.add(i1);
  file.add(i2);
  file.add(sep1);
  file.add(i3);

  file.add(i4);
  file.add(sep2);
  file.add(i5);
  mb.add(file);
  mb.add(edit);

  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setJMenuBar(mb);
  f.setSize(400,400);
  f.setLayout(null);
  f.setVisible(true);
 }
 public static void main(String s[])
 {
  new MenuExample();
 }
}  
  
  