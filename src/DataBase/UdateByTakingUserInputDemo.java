
package DataBase;
import java.sql.*;
import java.util.*;
public class UdateByTakingUserInputDemo {
    public static void main(String[] args) {
        
    
    Scanner in=new Scanner(System.in);
        System.out.println("id, cell number ");
        String id=in.next();
        String cell=in.next();
        String url="jdbc:mysql://localhost:3306/java_db";
        String uname="root";
        String pwd="";   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname, pwd);
             String sql="update tbl_person set cellno=? where id=?";
             PreparedStatement pst=con.prepareStatement(sql);
             pst.setString(1,cell);
           pst.setString(2,id);
            pst.execute();
            pst.close();
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
}
}
