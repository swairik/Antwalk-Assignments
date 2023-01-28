package material;

import stock.Inventory;

public class Laptops extends Inventory {
    private String company;

    public Laptops(int uid, String company) {
        super(uid);
        this.company = company;

        // setQuantity(5);
        setLowOrderLevelQuantity(3);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
