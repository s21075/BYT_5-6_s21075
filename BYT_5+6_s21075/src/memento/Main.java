package memento;

/**
 * Memento design pattern allows to save inner state of object outside,
 * without breaking encapsulation.
 */

public class Main {
    public static void main(String[] args) {
        GoodsList goodsList = new GoodsList(3000);
        goodsList.addGood("Apple", 3, 50);
        goodsList.addGood("Tomato", 4, 60);
        goodsList.addGood("Potato", 5, 70);
        System.out.println(goodsList);
        goodsList.saveList();
        goodsList.getGood_name_quan().clear();
        System.out.println(goodsList);
        goodsList.loadList();
        System.out.println(goodsList);
    }
}
