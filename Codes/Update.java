import java.sql.*;

class Update {
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
            String str="update student set age=5 where id=9";
            stmt.executeUpdate(str);
            System.out.println("Record Updated...");
            connxn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
