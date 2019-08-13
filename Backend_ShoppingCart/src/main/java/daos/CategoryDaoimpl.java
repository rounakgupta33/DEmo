package daos;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Category;


@Repository(value = "categoryDao")
@Transactional
public class CategoryDaoimpl implements CategoryDao{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addCategory(Category category) {
		try {
			System.out.println("Before session factory of Category dao");
			Session session = sessionFactory.getCurrentSession();
			session.persist(category);
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public List<Category> getAllCategory() {
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from Catagory");
			return query.list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public Category viewCategorybyId(int id) {
		try {
			Session session = sessionFactory.getCurrentSession();
			Category c = session.get(Category.class, id);
			return c;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean deleteCategory(int id) {
	
		return false;
	}

}
