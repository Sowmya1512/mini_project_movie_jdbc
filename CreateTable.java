import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws Exception {
        Connection con = DBUtil.getConnection();
        Statement st = con.createStatement();

        String sql = "CREATE TABLE IF NOT EXISTS movies (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY," +
                     "name VARCHAR(50)," +
                     "genre VARCHAR(50)," +
                     "rating DOUBLE)";

        st.execute(sql);
        System.out.println("Table MOVIES created successfully!");
        con.close();
    }
}