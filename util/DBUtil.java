
// import java.sql.*;
// public class DBUtil {
//     public static Connection getConnection() throws Exception {
//         return DriverManager.getConnection("jdbc:mysql://localhost:3306/moviedb","root","password");
//     }
// }


// import java.sql.Connection;
// import java.sql.DriverManager;

// public class DBUtil {
//     public static Connection getConnection() throws Exception {
//         Class.forName("org.h2.Driver");

//         return DriverManager.getConnection(
//             "jdbc:h2:./moviedb;AUTO_SERVER=TRUE",
//             "sa",
//             ""
//         );
//     }
// }



import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");

        return DriverManager.getConnection(
            "jdbc:h2:./moviedb;AUTO_SERVER=TRUE", 
            "sa", 
            ""
        );
    }
}
