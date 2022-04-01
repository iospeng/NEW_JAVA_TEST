package main.java.employee.CollectionCase;

public class Film {
    private String filmName;
    private String starName;
    private double fraction;

    public Film() {
    }

    public Film(String filmName, String starName, double fraction) {
        this.filmName = filmName;
        this.starName = starName;
        this.fraction = fraction;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public double getFraction() {
        return fraction;
    }

    public void setFraction(double fraction) {
        this.fraction = fraction;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmName='" + filmName + '\'' +
                ", starName='" + starName + '\'' +
                ", fraction=" + fraction +
                '}';
    }
}
