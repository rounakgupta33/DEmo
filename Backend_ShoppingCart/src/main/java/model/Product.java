package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue
	private int producId;
	private String productName;
	private String productDescription;
	@ManyToOne(cascade= CascadeType.PERSIST)
	private Category category;
	
	
	
	
	public void setCategory(Category category) {
		this.category = category;
	}




	public int getProducId() {
		return producId;
	}




	public void setProducId(int producId) {
		this.producId = producId;
	}




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public String getProductDescription() {
		return productDescription;
	}




	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}




	public Category getCategory() {
		return category;
	}




	@Override
	public String toString() {
		return "Product [producId=" + producId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", category=" + category + "]";
	}
	
	
	
}
