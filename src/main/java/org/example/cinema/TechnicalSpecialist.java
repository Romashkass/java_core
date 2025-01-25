package org.example.cinema;

public class TechnicalSpecialist {
    public static final int LOWER_LIMIT_MANUFACTURE_YEAR = 1886;

    private TechnicalSpecialist() {}

    static public boolean validateManufactureYear(int year) {
        return year >= LOWER_LIMIT_MANUFACTURE_YEAR && year < 10000;
    }

    static public boolean validateWeight(int weight) {
        return weight >= 0;
    }

    static public boolean validateColor (Color color) {
        return null != color;
    }

    static public boolean validateFilmType(FilmType type) {
        return null != type.getTypeName() && type.getTaxCoefficient() >= 0;
    }

    static public boolean validateRegistrationNumber(String number) {
        return null != number && number.matches("\\d{4}");
    }

    static public boolean validateName(String name) {
        return null != name && !name.isEmpty();
    }
}
