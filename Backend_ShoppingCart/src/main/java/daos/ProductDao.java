package daos;

import java.util.List;

import model.Product;

public interface ProductDao {
	public boolean addProduct(Product product);
	public List<Product> getAllProduct();
	public boolean deleteProduct(Product product);
}
