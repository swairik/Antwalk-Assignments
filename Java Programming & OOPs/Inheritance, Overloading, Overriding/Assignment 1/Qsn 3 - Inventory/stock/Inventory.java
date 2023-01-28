package stock;

public class Inventory {
    private static int quantity;
    private static int lowOrderLevelQuantity;
    private int uid;

    public Inventory(int uid) {
        this.uid = uid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        Inventory.quantity = quantity;
    }

    public int getLowOrderLevelQuantity() {
        return lowOrderLevelQuantity;
    }

    public void setLowOrderLevelQuantity(int lowOrderLevelQuantity) {
        Inventory.lowOrderLevelQuantity = lowOrderLevelQuantity;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

}