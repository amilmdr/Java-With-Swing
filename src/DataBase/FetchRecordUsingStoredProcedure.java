
package DataBase;
import java.sql.*;
public class FetchRecordUsingStoredProcedure {
     public static void main(String[] args) {
      String url="jdbc:mysql://localhost:3306/java_db";
        String uname="root";
        String pwd=""; 
         try{
                 Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection(url,uname, pwd);
            CallableStatement cst=con.prepareCall("{call fetch_record()}");
            ResultSet rs=cst.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            int colcount=rsmd.getColumnCount();
             for (int i = 1; i <=colcount; i++) {
                     System.out.print(rsmd.getColumnName(i)+"\t\t");
                 }
                System.out.println("");
             while (rs.next()){
                 for (int i = 1; i <=colcount; i++) {
                     System.out.print(rs.getString(i)+"\t\t");
                     
                 }
                 System.out.println("");
                 
                
             }
            con.close();
            
}
    
    catch(Exception ex){
        System.out.println(ex);
}
     }
}
