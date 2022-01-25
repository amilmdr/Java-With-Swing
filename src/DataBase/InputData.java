package DataBase;
import java.sql.*;
import java.util.*;
public class InputData {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter name, address, cell number ");
        String name=in.next();
        String address=in.next();
        String cell =in.next();
        String url="jdbc:mysql://localhost:3306/java_db";
        String uname="root";
        String pwd="";   
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname, pwd);
            String sql="insert into tbl_person(name,address,cellno)values(?,?,?)";
// String sql="insert into tbl_person(name,address,cellno)
//values('"+name+"','"+address+"','"+cell+"')";
//  Statement st=con.createStatement();
          
            //st.execute(sql);
            //st.close();
          PreparedStatement pst=con.prepareStatement(sql);
          pst.setString(1,name);
           pst.setString(2,address);
            pst.setString(3,cell);
            pst.execute();
            pst.close();
           
          
          
            
        }
        catch(Exception ex)
                {
                    System.out.println(ex);
                    
                }
    }
}
