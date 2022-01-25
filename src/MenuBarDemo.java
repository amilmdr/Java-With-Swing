import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 class MenuBarDemo  implements ActionListener{

      JFrame f1;
      JMenuBar mbar;
      JMenu m1,m2;
      JMenuItem mi1,mi2;
    MenuBarDemo()  {
         f1=new JFrame();
      mbar=new JMenuBar();
      m1=new JMenu("File");
      //m1.setMnemonic('F');
       m2=new JMenu("edit");
      mi1= new JMenuItem("new");
       mi1.addActionListener(this);
       mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK));//ctrl +n
      
      mi2= new JMenuItem("Exit");

      mi2.addActionListener(this);
      mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_MASK));//ctrl+e
      m1.add(mi1);
      m1.add(mi2);
      mbar.add(m1);
      mbar.add(m2);
      f1.setJMenuBar(mbar);
      
       f1.setSize(300,300);
       f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       
       f1.setVisible(true);
    
}
     public static void main(String[] args) {
        new MenuBarDemo();
    }
     public void actionPerformed(ActionEvent e) {
        if (e.getSource()==mi1){
          new CalResult();
        }
        else{
            f1.dispose();
        }
         if (e.getSource()==mi2){
         f1.dispose();
        }
       
    }
    }