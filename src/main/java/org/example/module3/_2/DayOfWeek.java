package org.example.module3._2;

public enum DayOfWeek {
    MONDAY("MON", false),
    TUESDAY("TUES", false),
    WEDNESDAY("WED", false),
    THURSDAY("THURS", false),
    FRIDAY("FRI", false),
    SATURDAY("SAT", true),
    SUNDAY("SUN", true);

    private boolean weekend;
    private String abbreviated;
    DayOfWeek(String abbreviated, boolean weekend) {
        this.weekend = weekend;
        this.abbreviated = abbreviated;
    }

    @Override
    public String toString() {
        return this.name() + "(" + abbreviated + ") is" + (weekend ? "" : " not") + " a weekend";
    }

    public static String getByNumber(int number) {
        for (DayOfWeek day: values()) {
            if (day.ordinal() == number - 1 ) {
                return day.toString();
            }
        }
        return String.valueOf(number);
    }
}
