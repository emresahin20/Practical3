package staticDemo;

public class Main {

	public static void main(String[] args) {

		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 19;
		product.name = "";
		product.id = 1;

		manager.add(product);

	}

}
