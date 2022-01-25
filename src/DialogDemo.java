import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class DialogDemo implements ActionListener {
    JFrame f1;
    JButton b1;
    JLabel l1;
    JDialog d1;
 //   Font f;
    DialogDemo(){
        f1=new JFrame(); 
        b1=new JButton("help");
       f1.add(b1);
      b1.addActionListener(this);
        
       f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       f1.setLayout(new FlowLayout());
       f1.setSize(300,300);
       f1.setVisible(true);
    
    }
    
    public static void main(String[] args) {
        new DialogDemo();  
    }
   public void actionPerformed(ActionEvent e) {
         l1=new JLabel("Contact us at abc@gmail.com");
     //    f=new Font("Times New Roman",Font.BOLD,20);
      //   l1.setFont(f);
        d1=new JDialog(f1,"contact detail",true);
         d1.setSize(200,200);
         d1.setLayout(new FlowLayout());
         d1.add(l1);
         d1.setVisible(true);
   }
}
