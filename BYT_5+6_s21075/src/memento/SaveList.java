package memento;

import java.util.HashMap;
import java.util.Map;

public class SaveList {
    final private Map<String, Integer> listOfGoods;
    final private int price;

    public SaveList(Map<String, Integer> listOfGoods, int price) {
        this.listOfGoods = new HashMap<>(listOfGoods);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Map<String, Integer> getListOfGoods() {
        return listOfGoods;
    }
}
