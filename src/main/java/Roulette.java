import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static java.lang.Math.min;

public class Roulette {
    private final ArrayList<String> toysWin = new ArrayList<>();

    // Разыгрываем призы
    public Roulette(int count, ToysForDraw toysForDraw) {
        for (int i = 0; i < min(count, toysForDraw.size()); i++) {
            Toy currentToy = toysForDraw.poll();
            toysWin.add(currentToy.getName());
        }
    }

    public void winToysList(String filePath) {
        try {
            FileWriter w = new FileWriter(filePath, true);
            w.write("\n  Разыгранные игрушки:\n=========================");
            for (int i = 0; i < toysWin.size(); i++) {
                w.write("\n " + (i + 1) + ". " + toysWin.get(i));
            }
            w.write("\n\n");
            w.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл!");
            return;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n  Разыгранные игрушки:\n=========================");
        for (int i = 0; i < toysWin.size(); i++) {
            sb.append("\n ").append(i + 1).append(". ").append(toysWin.get(i));
        }
        return sb.toString();
    }
}
