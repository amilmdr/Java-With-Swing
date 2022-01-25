package DataBase;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserVerification implements ActionListener {

    JFrame f1;
    JLabel l1, l2;
    JButton b1;
    JTextField t1;
    JPasswordField p1;

    UserVerification() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        b1 = new JButton("Login");
        b1.addActionListener(this);
        t1 = new JTextField(15);
        p1 = new JPasswordField(15);
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(p1);
        f1.add(b1);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        new UserVerification();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = t1.getText();
        String password = new String(p1.getPassword());
         String url = "jdbc:mysql://localhost:3306/java_db";
            String uname = "root";
            String pwd = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pwd);

     //String sql = "select *from tbl_login where username='"+username+"
            //'and password=md5('"+password+"')";
           // Statement st = con.createStatement();
            //ResultSet rs = st.executeQuery(sql);
            String sql = "select *from tbl_login where username=? and password=md5(?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,username);
             pst.setString(2,password);
             ResultSet rs=pst.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(f1, "Login Success");
            }
            else{
                JOptionPane.showMessageDialog(f1,"Login Failed");
            }
        } 
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
