import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class RadioCheckBoxDemo  implements ActionListener{
     JFrame f1;
     JLabel l1,l2,l3,l4;
     JTextField t1,t2;
     JRadioButton r1,r2;
     JCheckBox c1,c2,c3;
     JButton b1;
     JPanel p1,p2;
 RadioCheckBoxDemo(){
     f1=new JFrame();
     f1.setSize(300,300);
     f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f1.setLayout(new FlowLayout());
     l1=new JLabel("Name");
     l2=new JLabel("Adress");
     l3=new JLabel("Gender");
     l4=new JLabel("Hobbies");
     t1=new JTextField(20);
     t2=new JTextField(20);
     r1=new JRadioButton("Male");
     r2=new JRadioButton("Female");
     c1=new JCheckBox("Music");
     c2=new JCheckBox("Reading");
     c3=new JCheckBox("travelling");
     b1=new JButton("Submit");
     b1.addActionListener(this);
     ButtonGroup bg =new ButtonGroup();
     bg.add(r1);
     bg.add(r2);
     p1=new JPanel();
      p2=new JPanel();
      p1.add(l3); 
      p1.add(r1);
      p1.add(r2); 
      p2.add(l4);
      p2.add(c1);
      p2.add(c2); 
      p2.add(c3);
     f1.add(l1); f1.add(t1); f1.add(l2); f1.add(t2); f1.add(p1); f1.add(p2);  f1.add(b1);
           
     f1.setVisible(true);
 } 
    public static void main(String[] args) {
        new RadioCheckBoxDemo();
    }
    public void actionPerformed(ActionEvent e){
       String name=t1.getText();
       String address=t2.getText();
       String gender="";
       if(r1.isSelected()){
           gender="Male";
       }
       else if(r2.isSelected()){
           gender="Female";
                   
       }
       String hobbies="";
        if(c1.isSelected()){
          hobbies="Music";
        }
        if(c2.isSelected()){
            hobbies+=" , Reading";
        }
         if(c3.isSelected()){
           hobbies+=" , travelling"; 
        }
       JOptionPane.showMessageDialog(null, "Name: " +name + "\nAddress:"+address +"\nGender:"
       +gender+"\nHobbies:"+ hobbies);
    } 
}
