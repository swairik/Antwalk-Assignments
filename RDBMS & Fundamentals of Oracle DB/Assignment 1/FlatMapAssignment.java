package day7;

import java.util.*;
import java.util.stream.Collectors;

class Products {
	int id;
	String name;
	double price;
	
	public Products(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

public class FlatMapAssignment {

	public static void main(String[] args) {
		List<Products> productList1 = new ArrayList<>();
		List<Products> productList2 = new ArrayList<>();
		List<Products> productList3 = new ArrayList<>();
		List<List<Products>> allProducts = new ArrayList<>();

		productList1.add(new Products(101, "HP Laptop", 35000));
		productList1.add(new Products(102, "Acer Laptop", 65000));
		productList1.add(new Products(103, "Samsung Laptop", 45000));
		
		productList2.add(new Products(201, "HP Phone", 15999));
		productList2.add(new Products(202, "Acer Phone", 5999));
		productList2.add(new Products(203, "Samsung Phone", 25999));
		
		productList3.add(new Products(301, "HP Camera", 135000));
		productList3.add(new Products(302, "Acer Camera", 165000));
		productList3.add(new Products(303, "Samsung Camera", 145000));
		
	
		allProducts.add(productList1);
		allProducts.add(productList2);
		allProducts.add(productList3);
		
		List<Products> productsFlatMap= allProducts.stream().flatMap(p -> p.stream()).collect(Collectors.toList());
		
		System.out.println(productsFlatMap);
		
	}

}
