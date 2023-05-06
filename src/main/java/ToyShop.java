
import java.util.*;

public class ToyShop {
    private final ArrayList<Toy> allToys = new ArrayList<>();
    private int lastToyId = 0;

    // Добавление игрушки в магазин
    public void add(String name, int count, int frequency) {
        for (int i = 0; i < count; i++) {
            Toy toy = new Toy(lastToyId+1, name, frequency);
            allToys.add(toy);
        }
    }

    // Изменение частоты выпадения приза
    public void setFrequency(int id, int frequency) {
        for (Toy toy: allToys) {
            if (toy.getId() == id) {
                toy.setFrequency(frequency);
            }
        }
    }

    public ArrayList<Toy> getAllToys() {
        return allToys;
    }

// Подсчёт игрушек
    public void calculate() {
        HashMap<String, Integer> toysCount = new HashMap<>();
        for (Toy toy : allToys) {
            String toyName = toy.getName();
            int toyCount = toysCount.getOrDefault(toyName, 0);
            toysCount.put(toyName, toyCount+1);
        }
        System.out.println("Учёт игрушек в магазине: " +
                "\n=========================");
        for (Map.Entry<String, Integer> entry : toysCount.entrySet()) {
            System.out.println("  " + entry.getKey() + ":\t" + entry.getValue() + " шт.");
        }
    }

    // Формат вывода
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tКаталог игрушек: \n").append("=========================");
        for (Toy toy: this.allToys) {
            sb.append("\n  ").append(toy.getId()).append(". ").append(toy);
        }
        return sb.toString();
    }
}
