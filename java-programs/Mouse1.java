/*<applet code=Mouse1 width=200 height=200>
</applet>
*/
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
public class Mouse1 extends Applet implements MouseListener,MouseMotionListener
{
 String txt="Nothing";
 int x=10,y=30;
 public void init()
 {
  addMouseListener(this);
  addMouseMotionListener(this);
 }
 public void mouseClicked(MouseEvent me)
 {
  setForeground(Color.blue);
  txt="Mouse Clicked";
  repaint();
 }
 public void mouseEntered(MouseEvent me)
 {
  setForeground(Color.red);
  txt="Mouse Entered";
  repaint();
 }
 public void mouseExited(MouseEvent me)
 {
  txt="Mouse Exited";
  repaint();
 }
 public void mousePressed(MouseEvent me)
 {
  setForeground(Color.cyan);
  txt="Mouse Pressed";
  repaint();
 }
 public void mouseReleased(MouseEvent me)
 {
  setForeground(Color.magenta);
  txt="Mouse Released";
  repaint();
 }
 public void mouseDragged(MouseEvent me)
 {
  setForeground(Color.red);
  txt="Mouse Dragged";
  repaint();
 }
 public void mouseMoved(MouseEvent me)
 {
  setForeground(Color.green);
  txt="Mouse Moved";
  repaint();
 }
 public void paint(Graphics gp)
 {
  gp.drawString(txt,20,40);
  showStatus("Mouse event handling");
 }
}

