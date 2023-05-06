import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ToysForDraw {
    private final Queue<Toy> prizeToys = new LinkedList<>();

    // Добавление игрушек из магазина в призы
    public ToysForDraw(ToyShop toyShop) {
        ArrayList<Toy> toysForDraw = new ArrayList<>();
        for (Toy toy : toyShop.getAllToys()) {
            for (int i = 0; i < toy.getFrequency(); i++) {
                toysForDraw.add(toy);
            }
        }
        Collections.shuffle(toysForDraw);
        prizeToys.addAll(toysForDraw);
    }

    public int size() {
        return prizeToys.size();
    }

    public Toy poll() {
        return prizeToys.poll();
    }
}
