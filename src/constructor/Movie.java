package constructor;

public class Movie {
    String name;
    int date;
    String genre;
    String actor;
    String actress;

    public Movie(String name, int date, String genre, String actor, String actress) {
        this.name = name;
        this.date = date;
        this.genre = genre;
        this.actor = actor;
        this.actress = actress;
    }

    public Movie(String name, int date, String genre, String actor) {
        this.name = name;
        this.date = date;
        this.genre = genre;
        this.actor = actor;
    }

    public Movie(String name, int date, String genre) {
        this.name = name;
        this.date = date;
        this.genre = genre;
    }

    public Movie(String name, int date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Name: " + name + '\'' +
                "Date: " + date + '\'' +
                "Genre: " + genre + '\'' +
                "Actor: " + actor + '\'' +
                "Actress: " + actress + '\'' +
                '}';
    }
}
