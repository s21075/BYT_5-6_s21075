package objectPool;

public final class Equipment {
    String name;
    int quantity_available;
    int general_quantity;

    public Equipment(String name, int quantity) {
        System.out.println("There were no such equipment on a stock. But now is");
        this.name = name;
        quantity_available = quantity;
        this.general_quantity = quantity;
    }

    public void buyEquipment(int quantity){
        general_quantity+=quantity;
        quantity_available+=quantity;
        System.out.println("Available equipment quantity was not enough. Successfully bought more!");
    }

    public void giveEquipmentToWorker(){
        quantity_available--;
    }

    public void equipmentBackFromWorker(){
        quantity_available++;
    }

}
