
import java.sql.*;

class Dbase{
        
        final static String url="jdbc:mysql://localhost:3306";
        final static String username="root";
        final static String pwd="";

        public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connxn=DriverManager.getConnection(url,username,pwd);
            Statement stmt=connxn.createStatement();
            System.out.println("Cnn");
            stmt.executeUpdate("CREATE DATABASE NCIT");
            System.out.println("Database NCIT created");
            connxn.close();
        }catch(Exception e){
            System.out.println(e);
        }
}
}