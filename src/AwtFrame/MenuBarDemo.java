
package AwtFrame;
import java.awt.*;
import java.awt.event.*;

public class MenuBarDemo extends WindowAdapter{
     Frame f1;
     MenuBar mb1;
     Menu m1,m2,m3,m4;
     MenuItem mi1,mi2,mi3,mi4;
    
    MenuBarDemo(){ 
       f1 = new Frame();
     f1.setSize(300,300); 
     f1.addWindowListener(this);
     f1.setLayout(new FlowLayout());
     m1=new Menu("file");
     m2=new Menu("edit");
     m3=new Menu("view ");
     m4=new Menu("exit");
     mi1=new MenuItem("newn page ");
     mi2=new MenuItem("open ");
     mi3=new MenuItem("save ");
     mi4=new MenuItem("save as ");
     
     m1.add(mi1);
      m1.add(mi2);
       m1.add(mi3);
        m1.add(mi4);
      
     mb1=new MenuBar();
     mb1.add(m1);
     mb1.add(m2);
     mb1.add(m3);
     mb1.add(m4);
 f1.setMenuBar(mb1);
 f1.setVisible(true);
    }
    
    public static void main(String[] args) {
        new  MenuBarDemo();
    }
     public void windowClosing(WindowEvent e){
        f1.dispose();
     }
}
