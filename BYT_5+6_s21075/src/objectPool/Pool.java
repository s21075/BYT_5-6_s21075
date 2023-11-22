package objectPool;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Pool {
    private static Pool pool;
     Queue<Equipment> equipmentList = new ConcurrentLinkedQueue<>();


    public static Pool getPool() {
        if (pool == null) pool = new Pool();
        return pool;
    }

    public void giveEquipment(String name) {
        if(equipmentList.size()==0) equipmentList.add(new Equipment("Pickaxe", 1));
        for (Equipment e : equipmentList) {
            if (e.name.equals(name) && e.quantity_available > 0) {
                e.giveEquipmentToWorker();
                System.out.println(e.name + " successfully given");
            } else if (e.name.equals(name)) {
                e.buyEquipment(1);
                e.giveEquipmentToWorker();
            } else{
                equipmentList.add(new Equipment(name, 1));
                e.giveEquipmentToWorker();
                System.out.println(name + " successfully given");
            }

        }
    }

}
