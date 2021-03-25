import java.sql.*;

class DeleteDb {
    final static String url="jdbc:mysql://localhost:3306";
    final static String username="root";
    final static String pwd="";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to server...");
            Connection connxn=DriverManager.getConnection(url,username,pwd);
            System.out.println("Connected successfully...");
            Statement stmt=connxn.createStatement();
            String str="drop database ncit";
            stmt.executeUpdate(str);
            System.out.println("Successfully deleted database...");
            connxn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
