import javax.swing.*;
import java.awt.*;
public class LayeredPaneExample extends JFrame
{
 public LayeredPaneExample()
 {
  super("LayeredPane Example");
  setSize(500,500);
  JLayeredPane pane=getLayeredPane();
  
  JButton top=new JButton();
  top.setBackground(Color.white);
  top.setBounds(20,20,200,200);
  JButton middle=new JButton();
  middle.setBackground(Color.red);
  middle.setBounds(40,40,200,200);
  JButton bottom=new JButton();
  bottom.setBackground(Color.green);
  bottom.setBounds(60,60,200,200);

  pane.add(bottom,new Integer(1));
  pane.add(middle,new Integer(2));
  pane.add(top,new Integer(3));
 }
 public static void main(String args[])
 {
  LayeredPaneExample panel=new LayeredPaneExample();
  panel.setVisible(true);
 }
}
  