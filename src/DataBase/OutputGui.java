
package DataBase;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
public class OutputGui implements ActionListener {
  JFrame f1;
   JButton b1;
   JTable tbl;
    JScrollPane scp;
    DefaultTableModel model =new DefaultTableModel();
   OutputGui(){
        f1=new JFrame("List Demo");
   f1.setSize(300,300);
   f1.setLayout(new FlowLayout());
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    b1=new JButton("Click");
    b1.addActionListener(this);
    tbl=new JTable();
    scp=new JScrollPane(tbl);
    f1.add(b1);
    f1.add(scp);
    f1.setVisible(true);
   }
   
   
   
   
    public static void main(String[] args) {
        new OutputGui();
    }
    public void actionPerformed(ActionEvent e) {
        model=new DefaultTableModel();
        String url = "jdbc:mysql://localhost:3306/java_db";
            String uname = "root";
            String pwd = "";
            try{
                 Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname, pwd);
                 String [] cols={"ID","Name","Address","Cellno"};
                 model.setColumnIdentifiers(cols);
                 String sql="select *from tbl_person";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
           
            
            while(rs.next()){
            String row[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
                model.addRow(row);
            }
            tbl.setModel(model);
            con.close();
            }
            catch (Exception ex){
                System.out.println(ex);
            }
            
    }
    
}
