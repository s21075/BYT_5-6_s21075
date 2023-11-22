package objectPool;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alex");
        emp1.requestEquipment("Shovel");
        Employee emp2 = new Employee("Yurii");
        emp2.requestEquipment("Pickaxe");
        Employee emp3 = new Employee("John");
        emp3.requestEquipment("Axe");
    }
}
