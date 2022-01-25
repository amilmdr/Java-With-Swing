package StudentGuardian;

import javax.swing.*;
import java.awt.event.*;

public class Student extends JPanel implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1;

    Student() {
        l1 = new JLabel("name");
        l2 = new JLabel("address");
        l3 = new JLabel("faculty");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        t3 = new JTextField(15);
        b1 = new JButton("submit");
        b1.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String name=t1.getText();
       String address=t2.getText();
       String faculty=t3.getText();
       JOptionPane.showMessageDialog(null, "Name: " +name + "\nAddress:"+address +"\nFaculty:"
       +faculty);
    }

   

           }
