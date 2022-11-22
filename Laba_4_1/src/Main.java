import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Main {

    public static void task_4_1() {
        JFrame frame = new JFrame();
        JButton but_1 = new JButton("I'm here!");
        JButton but_2 = new JButton("Not there!");
        JButton but_3 = new JButton("Here!");
        frame.setSize(300, 200);
        frame.setLocation(500, 200);

        frame.add(but_1);
        frame.add(but_2);
        frame.add(but_3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void task_4_2() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton but_1 = new JButton("I'm here!");
        JButton but_2 = new JButton("Not there!");
        JButton but_3 = new JButton("Here!");
        frame.setSize(1000, 1000);
        panel.setSize(500, 500);
        frame.setLocation(500, 200);

        panel.add(but_1);
        panel.add(but_2);
        panel.add(but_3);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        task_4_1();
        task_4_2();
        JFrame frame = new JFrame("Основное окно");
        frame.setSize(1800, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel_1 = new JPanel();
        panel_1.setSize(500, 500);

        JLabel lbl_name = new JLabel("Имя :");
        JLabel lbl_surname = new JLabel("Фамилия :");
        JLabel lbl_data_of_birth = new JLabel("Дата рождения :");
        JLabel lbl_passport_number = new JLabel("Номер паспорта :");

        JTextField tx_1 = new JTextField("", 20);
        JTextField tx_2 = new JTextField("", 20);
        JTextField tx_3 = new JTextField("", 20);
        JTextField tx_4 = new JTextField("", 20);

        JButton but_1 = new JButton("Выполнить проверку первого этапа");


        panel_1.add(lbl_name);
        panel_1.add(tx_1);
        panel_1.add(lbl_surname);
        panel_1.add(tx_2);
        panel_1.add(lbl_data_of_birth);
        panel_1.add(tx_3);
        panel_1.add(lbl_passport_number);
        panel_1.add(tx_4);
        panel_1.add(but_1);


        JPanel panel_2 = new JPanel();
        panel_2.setSize(500, 500);

        JLabel lbl_city = new JLabel("Город");
        JLabel lbl_country = new JLabel("Страна");
        JLabel lbl_id_country = new JLabel("Номер страны");


        JTextField tx_5 = new JTextField("", 20);
        JTextField tx_6 = new JTextField("", 20);
        JTextField tx_7 = new JTextField("", 20);

        JButton but_2 = new JButton("Выполнить проверку второго этапа");


        panel_2.add(lbl_city);
        panel_2.add(tx_5);
        panel_2.add(lbl_country);
        panel_2.add(tx_6);
        panel_2.add(lbl_id_country);
        panel_2.add(tx_7);
        panel_2.add(but_2);

        frame.add(panel_1, BorderLayout.NORTH);
        frame.add(panel_2, BorderLayout.SOUTH);


        frame.setVisible(true);

        but_1.addActionListener(e -> {
            String name = tx_1.getText();
            String surname = tx_2.getText();
            String data_of_birth = tx_3.getText();//пример 2014-04-14 12:00:10
            String passport_number = tx_4.getText();

            String format = "yyyy-MM-dd hh:mm:ss";
            Calendar c = Calendar.getInstance();
            try {
                c.setTime(new SimpleDateFormat(format).parse(data_of_birth));
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }

            Print_inf print_man = new Personal_Data(name, surname, c, passport_number);
            Check_inf check_man = (Check_inf) print_man;
            print_man.print();
            check_man.check();
        });

        but_2.addActionListener(e -> {
            String city = tx_5.getText();
            String country = tx_6.getText();
            String id_country = tx_7.getText();

            Print_inf print_dislocate = new Dislocation(city, country, id_country);
            Check_inf check_dislocate = (Check_inf) print_dislocate;
            print_dislocate.print();
            check_dislocate.check();
        });
    }
}


