import java.util.*;
import java.applet.*;
import java.awt.*;
/*<applet code="digiclock" width=450 height=450>
</applet>*/
public class digiclock extends Applet
{
 String date;
 String time;
 int month,day,year;
 Font ft;
 int msec,sec,mi,hr;
 GregorianCalendar calendr;
 public void init()
 {
  setBackground(Color.pink);
  setForeground(Color.pink);
  ft=new Font("Arial",Font.BOLD,50);
  setFont(ft);
 }
 public void paint(Graphics gp)
 {
  calendr=new GregorianCalendar();
  day=calendr.get(Calendar.DATE);
  month=calendr.get(Calendar.MONTH);
  month+=1;
  year=calendr.get(Calendar.YEAR);
  date=" "+day+"/"+month+"/"+year;
  msec=calendr.get(Calendar.MILLISECOND);
  sec=calendr.get(Calendar.SECOND);
  mi=calendr.get(Calendar.MINUTE);
  hr=calendr.get(Calendar.HOUR);
  time=" "+hr+":"+mi+":"+sec+":"+msec;
  gp.drawRect(5,5,700,190);
  gp.drawString(date,20,80);
  gp.drawString(time,20,80);
  try
  {
   Thread.currentThread().sleep(100);
  }
  catch(InterruptedException ie)
  {
   ;
  }
  repaint();
  showStatus("Clock Display");
 }
}
  