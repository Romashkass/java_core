package org.example.cinema;

public class CinemaMain {
    public static void main(String[] args) {
        FilmType[] types = new FilmType[]{
                new FilmType("Film8", 1.2),
                new FilmType("Film16", 1),
                new FilmType("Film32", 1.5)
        };

        double maxTaxCoefficient = -1;
        double avgTaxCoefficient = 0;
        for (FilmType type: types) {
            type.display();

            if (type.getTaxCoefficient() > maxTaxCoefficient) {
                maxTaxCoefficient = type.getTaxCoefficient();
            }

            avgTaxCoefficient += type.getTaxCoefficient();
        }
        avgTaxCoefficient /= types.length;

        types[types.length - 1].setTaxCoefficient(1.3);

        System.out.println("maxTaxCoefficient: " + maxTaxCoefficient);
        System.out.println("avgTaxCoefficient: " + avgTaxCoefficient);
        System.out.println("types[types.length - 1].getTaxCoefficient(): " + types[types.length - 1].getTaxCoefficient());
    }
}
