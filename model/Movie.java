
public class Movie {
    private int id; private String name; private String genre; private double rating;
    public Movie(int id,String name,String genre,double rating){this.id=id;this.name=name;this.genre=genre;this.rating=rating;}
    public Movie(String name,String genre,double rating){this.name=name;this.genre=genre;this.rating=rating;}
    public int getId(){return id;} public String getName(){return name;} public String getGenre(){return genre;} public double getRating(){return rating;}
    public String toString(){return id+" "+name+" "+genre+" "+rating;}
}
