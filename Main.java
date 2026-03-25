
public class Main {
    public static void main(String[] args) throws Exception {
        MovieDao dao = new MovieDaoImpl();
        dao.addMovie(new Movie("Hero","Action",8.5));
        System.out.println(dao.getAll());
    }
}
