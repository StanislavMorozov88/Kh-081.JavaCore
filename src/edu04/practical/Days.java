package edu04.practical;

public enum Days {
    Mon("понеділок", "Monday"), Tue("вівторок", "Tuesday"), Wed("середа", "Wednesday"),
    Thu("четвер", "Thursday"), Fri("п'ятниця", "Friday"), Sat("субота","Saturday"),
    Sun("неділя", "Sunday");

    private final String ua;
    private final String en;

    Days(String ua, String en) {
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
