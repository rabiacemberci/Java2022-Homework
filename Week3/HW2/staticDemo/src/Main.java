public class Main {

    public static void main(String[] args) {
	ProductManager manager = new ProductManager();
	Product product = new Product();
	product.name = "Mouse";
	product.id = 10;
	manager.add(product);

	DatabaseHelper.Crus.Delete(); //inner class
    }


}
