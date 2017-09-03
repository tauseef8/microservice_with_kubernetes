/**
 * 
 */
package com.tk.webapp;

import java.io.Serializable;

/**
 * @author Tauseef.Khan
 *
 */
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	private Double price;
	private String seller;
	private String name;
	private String imgAdd;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getImgAdd() {
		return imgAdd;
	}

	public void setImgAdd(String imgAdd) {
		this.imgAdd = imgAdd;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", seller=" + seller + ", name=" + name + ", imgAdd=" + imgAdd + "]";
	}
}
