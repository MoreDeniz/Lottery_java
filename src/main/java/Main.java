public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        toyShop.add("Воздушный  змей", 12, 5);
        toyShop.add("Магнитные шашки", 10, 16);
        toyShop.add("Лазерная указка", 7, 16);
        toyShop.add("Пушистый зайчик", 15, 8);
        toyShop.add("Головоломка Шар", 25, 15);
        toyShop.add("Кубик - Рубика ", 30, 15);
        toyShop.add("Мыльные пузырики", 40, 25);

        toyShop.calculate();

        ToysForDraw toysForDraw = new ToysForDraw(toyShop);

        Roulette toysWin = new Roulette(5, toysForDraw);
        toysWin.winToysList("lots.txt");
        System.out.println(toysWin);

    }
}
