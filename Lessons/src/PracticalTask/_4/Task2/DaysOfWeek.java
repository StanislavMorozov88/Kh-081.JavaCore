package PracticalTask._4.Task2;

public enum DaysOfWeek {
    MONDAY("понеділок", "monday"),
    TUESDAY("вівторок", "tuesday"),
    WEDNESDAY("середа", "wednesday"),
    THURSDAY("четвер", "thursday"),
    FRIDAY("п'ятниця", "friday"),
    SATURDAY("субота", "saturday"),
    SUNDAY("неділя", "sunday");

    private final String ua;
    private final String en;

    DaysOfWeek(String ua, String en) {
        this.ua = ua;
        this.en = en;
    }
    public String getUa() {
        return ua;
    }
    public String getEn() {
        return en;
    }
}
