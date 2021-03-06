/**
 * 
 */
package com.codeagles.shop.categorysecond.vo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.codeagles.shop.category.vo.Category;
import com.codeagles.shop.product.vo.Product;

/**
 * <p>Title: CategorySecond</p>
 * <p>@function:</p>
 * @author Codeagles   ,
 * @date 上午10:26:11
 */
public class CategorySecond  implements Serializable{
	private Integer csid;
	private String csname;
	//一级分类的外键 对象类型
	private Category category;
	//配置商品的集合
	private Set<Product> products=new HashSet<Product>();
	
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public Integer getCsid() {
		return csid;
	}
	public void setCsid(Integer csid) {
		this.csid = csid;
	}
	public String getCsname() {
		return csname;
	}
	public void setCsname(String csname) {
		this.csname = csname;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
