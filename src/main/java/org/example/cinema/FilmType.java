package org.example.cinema;

public class FilmType {
    private String typeName;
    private double taxCoefficient;

    public FilmType() {
        this.typeName = "unknown";
        this.taxCoefficient = 0;
    }

    public FilmType(String name, double taxCoefficient) {
        this.typeName = name;
        this.taxCoefficient = taxCoefficient;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public double getTaxCoefficient() {
        return taxCoefficient;
    }

    public void setTaxCoefficient(double taxCoefficient) {
        this.taxCoefficient = taxCoefficient;
    }

    public void display() {
        System.out.println("typeName = " + typeName + '\n' +
                "taxCoefficient = " + taxCoefficient);
    }

    public String getString() {
        return typeName + ", \"" + taxCoefficient + "\"";
    }
}
