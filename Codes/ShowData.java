import java.sql.*;
class ShowData{
    final static String url="jdbc:mysql://localhost:3306/ncit";
    final static String username="root";
    final static String pwd="";
    public static void main(String[] args) {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connxn=DriverManager.getConnection(url,username,pwd);
        Statement stmt=connxn.createStatement();
        ResultSet r=stmt.executeQuery("Select * from student");
        while(r.next()){
            System.out.println("Roll:"+r.getInt(1));
            System.out.println("Name:"+r.getString(2));
            System.out.println("Address:"+r.getString(3));
            System.out.println("Age:"+r.getInt(4));
        }
        connxn.close();
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
