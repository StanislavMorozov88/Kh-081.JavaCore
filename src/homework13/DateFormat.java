package homework13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {

        String myDate = new SimpleDateFormat("MM.dd.yy").format(new Date());
        //.format(new Date());
        System.out.println("Formatted = " + myDate);
    }
}
