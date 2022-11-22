import javax.swing.*;
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


        String answer = """
                Имя:%s
                Фамилия:%s
                Дата рождения:%s
                Номер паспорта:%s
                """;
        JFrame frame_help = new JFrame("Вывод данных");
        JLabel lbl_answer = new JLabel(String.format(answer, name, surname, df.format(date), passport_number));
        frame_help.setSize(500, 500);
        frame_help.add(lbl_answer);
        frame_help.setVisible(true);
    }

    public void check() {
        Calendar calendar_now = new GregorianCalendar(2022, Calendar.OCTOBER, 20);
        boolean status = 18 <= calendar_now.get(Calendar.YEAR) - date_of_birth.get(Calendar.YEAR);


        String answer = "Статус проверки первого этапа : %s";

        JFrame frame_help = new JFrame("Проверка");
        JLabel lbl_answer = new JLabel(String.format(answer, status));
        frame_help.setSize(500, 500);
        frame_help.add(lbl_answer);
        frame_help.setVisible(true);
    }
}
