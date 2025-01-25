package org.example.cinema;

import java.util.Objects;

public class Film implements Comparable<Film>{
    private FilmType filmType;
    private String name;
    private int registrationNumber;
    private int weight;
    private int manufactureYear;
    private String genre;
    private Color color;

    public Film() {
        this.filmType = new FilmType();
        this.name = "unknown";
        this.registrationNumber = -1;
        this.weight = -1;
        this.manufactureYear = -1;
        this.genre = "unknown";
        this.color = Color.BLACK_WHITE;
    }

    public Film(FilmType filmType, String name, int registrationNumber, int weight, int manufactureYear, String genre, Color color) {
        this.filmType = filmType;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.weight = weight;
        this.manufactureYear = manufactureYear;
        this.genre = genre;
        this.color = color;
    }

    public FilmType getFilmType() {
        return filmType;
    }

    public void setFilmType(FilmType filmType) {
        this.filmType = filmType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCalcTaxPerMonth() {
        return weight * 0.0013 + filmType.getTaxCoefficient() * 30 + 5;
    }

    @Override
    public String toString() {
        return filmType.getString() + ", " + name + ", " + registrationNumber + ", " + weight + ", " + manufactureYear + ", " + genre + ", " + color + ", " + getCalcTaxPerMonth();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(filmType, film.filmType) && Objects.equals(name, film.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmType, name);
    }

    @Override
    public int compareTo(Film o) {
        int result = Integer.compare(manufactureYear, o.manufactureYear);
        if (result == 0) {
            result = name.compareTo(o.name);
        }
        return result;
    }
}
