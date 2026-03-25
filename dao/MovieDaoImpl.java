
import java.sql.*;
import java.util.*;
public class MovieDaoImpl implements MovieDao {
    public void addMovie(Movie m) throws Exception {
        Connection con = DBUtil.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO movies(name,genre,rating) VALUES(?,?,?)");
        ps.setString(1,m.getName()); ps.setString(2,m.getGenre()); ps.setDouble(3,m.getRating());
        ps.executeUpdate();
    }
    public List<Movie> getAll() throws Exception {
        Connection con = DBUtil.getConnection();
        List<Movie> list = new ArrayList<>();
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM movies");
        while(rs.next()) list.add(new Movie(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
        return list;
    }
}
