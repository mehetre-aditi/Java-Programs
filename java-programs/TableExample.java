import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
class TableExample
{
 public static void main(String args[])
 {
  new MyTable();
 }
}
class MyTable extends JFrame implements ActionListener
{
 JTable table;
 JTextField t1,t2,t3;
 final DefaultTableModel model;
 JButton b1,b2,b3;
 MyTable()
 {
  setSize(500,500);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  Object[][] data={{100,"Raghav",22},{101,"Janki",23},{102,"Lakhan",23}};
  String cols[]={"RoolNo","Name","Age"};
  model=new DefaultTableModel(data,cols);
  table=new JTable(model);
  setLayout(new GridLayout(3,1));
  JPanel panel=new JPanel();
  add(new JScrollPane(table));
  add(new JPanel());
  add(panel);

  t1=new JTextField(); 
  t2=new JTextField();
  t3=new JTextField();

  b1=new JButton("Add"); 
  b2=new JButton("Update");
  b3=new JButton("Delete");  
 
  panel.setLayout(new GridLayout(3,3));
  panel.add(new JLabel("RollNo"));
  panel.add(t1);
  panel.add(b1);

  panel.add(new JLabel("Names"));
  panel.add(t2);
  panel.add(b2);

  panel.add(new JLabel("Age"));
  panel.add(t3);
  panel.add(b3);

  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  validate();
 }
 
 public void actionPerformed(ActionEvent e)
 {
  if(t1.getText().toString().isEmpty()||t2.getText().toString().isEmpty()||t3.getText().toString().isEmpty())
  {
   JOptionPane.showMessageDialog(null,"Please fill all the text boxes","error",JOptionPane.ERROR_MESSAGE);
  }
  else
  {
   int rno=Integer.parseInt(t1.getText());
   String name=t2.getText();
   int age=Integer.parseInt(t3.getText());
   Object newrow[]={rno,name,age};
   model.addRow(newrow);
   t1.setText(null);
   t2.setText(null);
   t3.setText(null);
  }
 }
}
 
