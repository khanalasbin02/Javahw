import java.sql.*;

class Tcreation {
    final static String url="jdbc:mysql://localhost:3306/NCIT";
    final static String username="root";
    final static String pwd="";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to a selected database...");
            Connection connxn=DriverManager.getConnection(url,username,pwd);
            System.out.println("Connected database successfully...");
            Statement stmt=connxn.createStatement();
            String str="CREATE TABLE student " +
            "(id INTEGER PRIMARY KEY not NULL, " +
            " name VARCHAR(25), " + 
            " address VARCHAR(25), " + 
            " age INTEGER )";
            stmt.executeUpdate(str);
            System.out.println("Table student created...");
            connxn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
