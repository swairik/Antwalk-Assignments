package material;

import stock.Inventory;

public class Accessories extends Inventory {
    private String type;

    public Accessories(int uid, String type) {
        super(uid);
        this.type = type;

        // setQuantity(10);
        setLowOrderLevelQuantity(5);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
