package stock;

import java.util.Scanner;
import material.*;

public class Order {
    public static void generateInvoice(int n, String type) {
        System.out.println("Invoice generated for " + n + " " + type);
    }

    public static void main(String[] args) {
        Laptops[] l = new Laptops[5];
        String company[] = new String[] { "Dell", "HP", "Apple", "Microsoft", "Asus" };
        for (int i = 0; i < 5; i++) {
            l[i] = new Laptops(i, company[i]);
            l[i].setQuantity(l[i].getQuantity() + 1);
        }
        Accessories a[] = new Accessories[10];
        String[] type = new String[] { "Headphones", "Charger", "Lamp", "Connector", "Stylus", "Mouse", "Keyboard",
                "Pendrive", "CD", "Lamp" };
        for (int i = 0; i < 10; i++) {
            a[i] = new Accessories(i * 100, type[i]);
            a[i].setQuantity(a[i].getQuantity() + 1);
        }

        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to order ? Enter 1 for Laptops or 2 for Accessories?");
        int o = Integer.parseInt(in.nextLine());
        System.out.println("How many do you want to order?");
        int num = Integer.parseInt(in.nextLine());

        if (o == 1) {
            if (num < l[0].getLowOrderLevelQuantity()) {
                System.out.println("RFM");
            } else if (num < l[0].getQuantity()) {
                System.out.println("Not enough left in inventory");
            } else {
                generateInvoice(num, "laptops");

            }
        } else if (o == 2) {
            if (num < a[0].getLowOrderLevelQuantity()) {
                System.out.println("RFM");
            } else if (num < a[0].getQuantity()) {
                System.out.println("Not enough left in inventory");
            } else {
                generateInvoice(num, "accessories");
            }
        } else {
            System.out.println("WRONG INPUT!!!");
        }
        in.close();
    }
}
