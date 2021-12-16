import java.sql.*;

public class DBUtils {
    private static Connection getConnnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/dbs?serverTimezone=GMT","root","");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args){
        Connection conn = getConnnection();
        System.out.println(conn);
    }
}
