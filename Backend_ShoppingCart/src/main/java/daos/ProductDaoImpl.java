package daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dbconfig.DBConfig;
import model.Product;


@Repository(value="productDao")
@Transactional
public class ProductDaoImpl implements ProductDao{

@Autowired
 private SessionFactory sessionFactory;

	public boolean addProduct(Product product) {
		try {
			System.out.println("Before session Factory" +sessionFactory);
		Session session = sessionFactory.getCurrentSession();
		System.out.println("After session Factory");
				session.persist(product);
				return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Product> getAllProduct() {
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from Product");
			return query.list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean deleteProduct(Product product) {
		
		return false;
	}

}
