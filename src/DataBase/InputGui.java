package DataBase;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class InputGui implements ActionListener {

    JFrame f1;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;
    InputGui() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        l1 = new JLabel("Name");
        l2 = new JLabel("Address");
        l3 = new JLabel("Cello no");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        b1 = new JButton("Save");
        b1.addActionListener(this);
        b2 = new JButton("Clear");
        b2.addActionListener(this);
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l3);
        f1.add(t3);
        f1.add(b1);
        f1.add(b2);
        f1.setVisible(true);

    }

    public static void main(String[] args) {
        new InputGui();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            String name = t1.getText();
            String address = t2.getText();
            String cell = t3.getText();
            String url = "jdbc:mysql://localhost:3306/java_db";
            String uname = "root";
            String pwd = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, uname, pwd);
                String sql = "insert into tbl_person(name,address,cellno)values(?,?,?)";

                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, address);
                pst.setString(3, cell);
                pst.execute();
                pst.close();

            } catch (Exception ex) {
                System.out.println(ex);

            }
            t1.setText("");
            t2.setText("");
            t3.setText("");
            JOptionPane.showMessageDialog(null, "data is  inserted ");
        } else if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }

    }
}
