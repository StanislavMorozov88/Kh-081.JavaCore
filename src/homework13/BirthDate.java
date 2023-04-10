package homework13;

import java.time.LocalDate;

public class BirthDate {
    private LocalDate localDateBirthday;
    public BirthDate(int year, int month, int day) {
        localDateBirthday = LocalDate.of(year, month, day);
    }

    public LocalDate getLocalDateBirthday() {
        return localDateBirthday;
    }

    public static void main(String[] args) {
        BirthDate myBirthDate = new BirthDate(1982, 7, 29);
        LocalDate myBirthDateInSixMonths = myBirthDate.localDateBirthday.plusMonths(6);
        LocalDate myBirthDateInYear = myBirthDate.localDateBirthday.plusYears(1);

        System.out.println("myBirthDate = " + myBirthDate.localDateBirthday);

        System.out.println("The DayOfWeek for myBirthDate = " + myBirthDate.localDateBirthday.getDayOfWeek());
        System.out.println("The DayOfWeek for myBirthDateInSixMonths = " + myBirthDateInSixMonths.getDayOfWeek());
        System.out.println("The DayOfWeek for myBirthDateInYear = " + myBirthDateInYear.getDayOfWeek());

    }
}
