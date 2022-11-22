import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Personal_Data implements Print_inf, Check_inf {
    String name;
    String surname;
    Calendar date_of_birth;
    String passport_number;

    Personal_Data(String name, String surname, Calendar date_of_birth, String passport_number) {

        this.name = name;
        this.surname = surname;
        this.date_of_birth = date_of_birth;
        this.passport_number = passport_number;
    }

    public void print() {

        Date date = date_of_birth.getTime();
        DateFormat df = new SimpleDateFormat("dd MMM yyy");

        System.out.printf("""
                Имя:%s
                Фамилия:%s
                Дата рождения:%s
                Номер паспорта:%s
                """, name, surname, df.format(date), passport_number);
    }

    public void check() {
        Calendar calendar_now = new GregorianCalendar(2022, Calendar.OCTOBER, 20);
        boolean status = 18 <= calendar_now.get(Calendar.YEAR) - date_of_birth.get(Calendar.YEAR);
        System.out.printf("Статус проверки первого этапа : %s \n", status);
    }
}
