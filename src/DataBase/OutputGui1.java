
package DataBase;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class OutputGui1 implements ActionListener {
 JFrame f1;
   JButton b1;
   JTable tbl;
    JScrollPane scp;
   OutputGui1(){
        f1=new JFrame("List Demo");
   f1.setSize(300,300);
   f1.setLayout(new BorderLayout());
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    b1=new JButton("Click");
    
    b1.addActionListener(this);
    f1.add(b1,BorderLayout.SOUTH);
    
     f1.setVisible(true);
       
   }
    public void actionPerformed(ActionEvent e) {
            String url = "jdbc:mysql://localhost:3306/java_db";
            String uname = "root";
            String pwd = "";
            try{
                 Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname, pwd);
                 
                 String sql="select *from tbl_person";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] cols={"ID","Name","Address","Cellno"};
            int count=0;
            while(rs.next()){
                count++;
                
            }
            Object data[][]=new Object[count][4];
           rs.beforeFirst();
            int row =0;
            while(rs.next()){
                data [row][0]=rs.getString(1);
                data [row][1]=rs.getString(2);
                data [row][2]=rs.getString(3);
                data [row][3]=rs.getString(4);
                row++;
                
            }
            tbl=new JTable(data,cols);
    scp=new JScrollPane(tbl);
    f1.add(scp);
    f1.setVisible(true);
    con.close();
            
            
    }
            catch(Exception ex){
                System.out.println(ex); 
            }
    }
    public static void main(String[] args) {
        new OutputGui1();
    }
}
