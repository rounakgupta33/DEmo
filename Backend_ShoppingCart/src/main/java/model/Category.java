package model;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {
			@Id
			@GeneratedValue
			private int categoryId;
			private String categoryName;
			private String categoryDescription;
			@OneToMany(mappedBy="category",cascade=CascadeType.PERSIST)
			private Set<Product> product;
		
			public int getCategoryId() {
				return categoryId;
			}
			public void setCategoryId(int categoryId) {
				this.categoryId = categoryId;
			}
			public String getCategoryName() {
				return categoryName;
			}
			public void setCategoryName(String categoryName) {
				this.categoryName = categoryName;
			}
			public String getCategoryDescription() {
				return categoryDescription;
			}
			public void setCategoryDescription(String categoryDescription) {
				this.categoryDescription = categoryDescription;
			}
			public Set<Product> getProduct() {
				return product;
			}
			public void setProduct(Set<Product> product) {
				this.product = product;
			}
			@Override
			public String toString() {
				return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName
						+ ", categoryDescription=" + categoryDescription + ", product=" + product + "]";
			}
			
			
			
			
			
}
