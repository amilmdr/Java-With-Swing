
package DataBase;

import java.sql.*;

public class SaveRecord {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/java_db";
        String uname="root";
        String pwd="";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname, pwd);
            
// String sql="insert into tbl_person(name,address,cellno)values('ram','ktm','98680')";
//  String sql="insert into tbl_person(name,address,cellno)values('hari','ktm','986800'),
//('ramhari','ktm','986800')";
// String sql="update tbl_person set cellno='9860660067' where id=1 ";
          String sql="delete from  tbl_person where id=1";
            Statement st=con.createStatement();
            st.execute(sql);
            st.close();
            
        }
        catch(Exception ex){
            System.out.println(ex);
            
        }
    }
    
}
