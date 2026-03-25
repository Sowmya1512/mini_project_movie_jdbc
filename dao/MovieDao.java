
import java.util.*;
public interface MovieDao {
    void addMovie(Movie m) throws Exception;
    List<Movie> getAll() throws Exception;
}
