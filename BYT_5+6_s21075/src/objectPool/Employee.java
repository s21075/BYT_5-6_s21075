package objectPool;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
    public void requestEquipment(String name){
        System.out.println(name + " is requested");
        Pool.getPool().giveEquipment(name);
    }
}
