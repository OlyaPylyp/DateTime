import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date7 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date newDate = simpleDateFormat.parse("12/12/2012 12:12:12");
        String date = simpleDateFormat.format(newDate);
        System.out.println(date);
        Date dateTime = new Date(1355393532000L);
        String date1 = simpleDateFormat.format(dateTime);
        System.out.println(date1);





    }
}
