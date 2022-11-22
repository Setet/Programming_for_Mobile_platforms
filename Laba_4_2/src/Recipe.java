import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Recipe {
    static int i;
    String food;

    Recipe(int i, String food) {
        Recipe.i = i;
        this.food = food;
    }

    public void print_recipe() {
        String path = "recipe_";
        try (BufferedReader reader = new BufferedReader(new FileReader(path + i + ".txt"))) {
            String value = reader.readLine();

            String[] words = value.split("\\. ");


            SwingUtilities.invokeLater(() ->
            {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s : words) {
                    stringBuilder.append(s).append("\n");
                }
                JTextArea textArea = new JTextArea(stringBuilder.toString());
                JFrame frame = new JFrame("Рецепт : " + food);

                textArea.setEditable(false);
                frame.add(new JScrollPane(textArea));
                frame.setSize(1000, 600);
                frame.setLocationRelativeTo(null);

                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void print_ingredients() {
        String path = "ingredients_";
        try {
            File file = new File(path + i + ".txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            List<String> list = new java.util.ArrayList<>(List.of());
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }

            SwingUtilities.invokeLater(() ->
            {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s : list) {
                    stringBuilder.append(s).append("\n");
                }
                JTextArea textArea = new JTextArea(stringBuilder.toString());
                JFrame frame = new JFrame("Ингредиенты : " + food);

                textArea.setEditable(false);
                frame.add(new JScrollPane(textArea));
                frame.setSize(1000, 600);
                frame.setLocationRelativeTo(null);

                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
