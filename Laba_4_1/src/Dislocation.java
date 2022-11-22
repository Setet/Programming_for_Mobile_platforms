import javax.swing.*;
import java.util.Objects;

class Dislocation implements Print_inf, Check_inf {
    String city;
    String country;
    String id_country;

    Dislocation(String city, String country, String id_country) {
        this.city = city;
        this.country = country;
        this.id_country = id_country;

    }

    public void print() {
        String answer = """
                Город:%s
                Страна:%s
                Номер страны:%s
                """;
        JFrame frame_help = new JFrame("Вывод данных");
        JLabel lbl_answer = new JLabel(String.format(answer, city, country, id_country));
        frame_help.setSize(500, 500);
        frame_help.add(lbl_answer);
        frame_help.setVisible(true);
    }

    public void check() {
        boolean status = Objects.equals(country, "Russia") & Objects.equals(id_country, "228");

        String answer = "Статус проверки второго этапа : %s";

        JFrame frame_help = new JFrame("Проверка");
        JLabel lbl_answer = new JLabel(String.format(answer, status));
        frame_help.setSize(500, 500);
        frame_help.add(lbl_answer);
        frame_help.setVisible(true);
    }
}
