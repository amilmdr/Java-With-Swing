
package DataBase;
import java.sql.*;

public class DisplayRecordDemo {
    public static void main(String[] args) {
      String url="jdbc:mysql://localhost:3306/java_db";
        String uname="root";
        String pwd="";   
    
    try{
    Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname, pwd);
            
            
            String sql="select *from tbl_person";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()){
                /*
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("address"));
                System.out.println(rs.getString("cellno"));
                */
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            }
            con.close();
            
}
    
    catch(Exception ex){
        System.out.println(ex);
}
}
}

