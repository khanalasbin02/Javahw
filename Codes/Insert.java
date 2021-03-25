import java.sql.*;
import java.util.Scanner;

class Insert {
    final static String url="jdbc:mysql://localhost:3306/NCIT";
    final static String username="root";
    final static String pwd="";
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connxn=DriverManager.getConnection(url,username,pwd);
            PreparedStatement stmt=connxn.prepareStatement("INSERT INTO student values(?,?,?,?)");
            do{
                System.out.println("Enter roll");
                int roll=scan.nextInt();
                System.out.println("Enter Name");
                String name=scan.nextLine();
                System.out.println("Enter address");
                String address=scan.nextLine();
                System.out.println("Enter age");
                int age=scan.nextInt();

                stmt.setInt(1,roll);
                stmt.setString(2,name);
                stmt.setString(3,address);
                stmt.setInt(4,age);

                stmt.executeUpdate();
                
                System.out.println("Press 'n' to exit");
                String prompt=scan.nextLine();
                if(prompt.startsWith("n")){
                    break;
                }
            }while(true);
            System.out.println("Records inserted into table successfully...");
            connxn.close();
        }catch(Exception e){
            System.out.println(e);
        }
     
    }
}
