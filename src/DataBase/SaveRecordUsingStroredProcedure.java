
package DataBase;

import java.sql.*;


public class SaveRecordUsingStroredProcedure {
      public static void main(String[] args) {
      String url="jdbc:mysql://localhost:3306/java_db";
        String uname="root";
        String pwd="";
         try{
                 Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection(url,uname, pwd);
         CallableStatement cst=con.prepareCall("{call save_record(?,?,?)}");
         cst.setString(1,"AMIL");
         cst.setString(2, "ktm");
         cst.setString(3, "9860675045");
         cst.execute();
      }
         catch(Exception ex){
             System.out.println(ex);
         }
      }
}
