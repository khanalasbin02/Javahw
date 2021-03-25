import java.sql.*;

class DeleteTable {
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
            String str="drop table student";
            stmt.executeUpdate(str);
            System.out.println("Successfully deleted table...");
            connxn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
