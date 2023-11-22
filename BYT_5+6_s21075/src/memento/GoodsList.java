package memento;

import java.util.HashMap;
import java.util.Map;

public class GoodsList {
    private SaveList saveList;
    private Map<String, Integer> good_name_quan = new HashMap<>();
    private int price;

    public GoodsList(int price) {
        this.price = price;
    }

    public void addGood(String name, int quantity, int price){
        good_name_quan.put(name, quantity);
        this.price+=price;
    }

    public void saveList(){
        saveList = new SaveList(good_name_quan, price);
    }

    public void loadList(){
        good_name_quan = saveList.getListOfGoods();
        price = saveList.getPrice();
    }

    public Map<String, Integer> getGood_name_quan() {
        return good_name_quan;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "GoodsList{" +
                "good_name_quan=" + good_name_quan +
                ", price=" + price +
                '}';
    }
}
