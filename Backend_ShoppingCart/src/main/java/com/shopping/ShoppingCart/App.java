package com.shopping.ShoppingCart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import daos.ProductDao;
import daos.ProductDaoImpl;
import model.Category;
import model.Product;

public class App 
{
    public static void main(String[] args )
    {
    	
    	ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\rounak.gupta\\eclipse-workspace\\Backend_ShoppingCart\\src\\main\\java\\springs.xml");
    	ProductDao pd=context.getBean("productDao",ProductDao.class);
      
    	Category category = new Category();
    	category.setCategoryName("Product1");
    	category.setCategoryDescription("type_1");
       
       Product product  = new Product();
       product.setProductName("abc");
       product.setProductDescription("design");
       product.setCategory(category);
       
       
       pd.addProduct(product);
       
      
      
      /*
       Category category1 = new Category();
	   category1.setCategoryName("Product2");
	   category1.setCategoryDescription("type_2");
      
       Product product1 = new Product();
       product1.setProductName("mno");
       product1.setProductDescription("clothing");
       product1.setCategory(category1);
       
       pd.addProduct(product1);
       
       
       
       
       
       Category category2 = new Category();
       category2.setCategoryName("Product3");
       category2.setCategoryDescription("type_3");
       
       Product product2 = new Product();
       product2.setProductName("pqr");
       product2.setProductDescription("electronics");
       product2.setCategory(category2);
       
       pd.addProduct(product2);*/
       
       
    }
}
