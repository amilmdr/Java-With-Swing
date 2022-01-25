
package StudentGuardian;
import javax.swing.*;
import java.awt.event.*;
public class Guardian extends JPanel implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;
 Guardian(){
      l1=new JLabel("name");
        l2=new JLabel("relation");
        l3=new JLabel("cell num");
        t1=new JTextField(15);
         t2=new JTextField(15); 
         t3=new JTextField(15);
         b1=new JButton("submit");
         add(l1);add(t1);
          add(l2);add(t2);
           add(l3);add(t3);
            add(b1);
             b1.addActionListener(this);
    
 }   

  
    public void actionPerformed(ActionEvent e) {
         String name=t1.getText();
       String relation=t2.getText();
       String cellnum=t3.getText();
       JOptionPane.showMessageDialog(null, "Name: " +name + "\nrelation:"+relation +"\ncellnum:"
       +cellnum);
    
    }
}
