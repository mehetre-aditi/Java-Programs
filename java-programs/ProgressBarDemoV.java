import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ProgressBarDemoV
{
 public static void main(String s[])
 {
  JFrame fr=new JFrame("ProgressBar Demo");
  fr.setLayout(new FlowLayout());
  fr.setSize(500,300);
  fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  fr.setVisible(true);
  JProgressBar pb=new JProgressBar(0,100);
  fr.add(pb);
  pb.setStringPainted(true);
  pb.setOrientation(SwingConstants.VERTICAL);
  int i=0;
  while(i<=100)
  {
   if(i>=0 && i<=50)
    pb.setString("Processing.....");
   if(i>=50 && i<=70)
    pb.setString("Wait for Sometime.....");
   if(i>=70 && i<=90)
    pb.setString("About to complete.....");
   if(i==100)
    pb.setString("Finished.....");

  pb.setValue(i);
  try
  {
   Thread.sleep(2000);
  }
  catch(Exception e){}
  i=i+10;
  }
 }
}