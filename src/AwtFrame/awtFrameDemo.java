
package AwtFrame;
import java.awt.*;
import java.awt.event.*;

public class awtFrameDemo extends WindowAdapter {
    Frame f1;
   
 awtFrameDemo(){
     f1 = new Frame();
     f1.setSize(300,300);
     f1.setVisible(true);
     f1.addWindowListener(this);
 } 
    public static void main(String[] args) {
        new awtFrameDemo();
    }
    public void windowClosing(WindowEvent e){
        f1.dispose();
    }
 
}
