import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        JFrame main_frame = new JFrame("Меню");
        main_frame.setSize(1000, 1000);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel main_panel = new JPanel();
        main_panel.setSize(500, 500);

        list.add("Мясной фарш");
        JButton but_recipe_1 = new JButton(list.get(0));

        but_recipe_1.addActionListener(e -> {
            int i = 1;
            Recipe recipe = new Recipe(i, list.get(0));
            recipe.print_recipe();
            recipe.print_ingredients();
        });

        list.add("Мясной омлет");
        JButton but_recipe_2 = new JButton(list.get(1));

        but_recipe_2.addActionListener(e -> {
            int i = 2;
            Recipe recipe = new Recipe(i, list.get(1));
            recipe.print_recipe();
            recipe.print_ingredients();
        });

        list.add("Яичница с фаршем, овощами и зеленью");
        JButton but_recipe_3 = new JButton(list.get(2));

        but_recipe_3.addActionListener(e -> {
            int i = 3;
            Recipe recipe = new Recipe(i, list.get(2));
            recipe.print_recipe();
        });

        list.add("Мясные маффины с яйцом");
        JButton but_recipe_4 = new JButton(list.get(3));

        but_recipe_4.addActionListener(e -> {
            int i = 4;
            Recipe recipe = new Recipe(i, list.get(3));
            recipe.print_recipe();
        });

        list.add("Фарш в салатных чашечках");
        JButton but_recipe_5 = new JButton(list.get(4));

        but_recipe_5.addActionListener(e -> {
            int i = 5;
            Recipe recipe = new Recipe(i, list.get(4));
            recipe.print_recipe();
        });

        list.add("Пастуший пирог");
        JButton but_recipe_6 = new JButton(list.get(5));

        but_recipe_6.addActionListener(e -> {
            int i = 6;
            Recipe recipe = new Recipe(i, list.get(5));
            recipe.print_recipe();
        });

        list.add("Мексиканский салат");
        JButton but_recipe_7 = new JButton(list.get(6));

        but_recipe_7.addActionListener(e -> {
            int i = 7;
            Recipe recipe = new Recipe(i, list.get(6));
            recipe.print_recipe();
        });

        list.add("Спагетти с фрикадельками");
        JButton but_recipe_8 = new JButton(list.get(7));

        but_recipe_8.addActionListener(e -> {
            int i = 8;
            Recipe recipe = new Recipe(i, list.get(7));
            recipe.print_recipe();
        });

        list.add("Салатный бургер");
        JButton but_recipe_9 = new JButton(list.get(8));

        but_recipe_9.addActionListener(e -> {
            int i = 9;
            Recipe recipe = new Recipe(i, list.get(8));
            recipe.print_recipe();
        });

        list.add("Кебаб");
        JButton but_recipe_10 = new JButton(list.get(9));

        but_recipe_10.addActionListener(e -> {
            int i = 10;
            Recipe recipe = new Recipe(i, list.get(9));
            recipe.print_recipe();
        });

        main_panel.add(but_recipe_1);
        main_panel.add(but_recipe_2);
        main_panel.add(but_recipe_3);
        main_panel.add(but_recipe_4);
        main_panel.add(but_recipe_5);
        main_panel.add(but_recipe_6);
        main_panel.add(but_recipe_7);
        main_panel.add(but_recipe_8);
        main_panel.add(but_recipe_9);
        main_panel.add(but_recipe_10);

        main_frame.add(main_panel);
        main_frame.setVisible(true);
    }
}

