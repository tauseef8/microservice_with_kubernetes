/**
 * 
 */
package com.tk.dealoftheday;

import java.io.Serializable;

/**
 * @author Tauseef.Khan
 *
 */
public class DealOfDay implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double price;
	private String discount;
	private String name;
	private String minSku;
	private Double totalPrice;
	private String imgAdd;
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMinSku() {
		return minSku;
	}
	public void setMinSku(String minSku) {
		this.minSku = minSku;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getImgAdd() {
		return imgAdd;
	}
	public void setImgAdd(String imgAdd) {
		this.imgAdd = imgAdd;
	}
	
	@Override
	public String toString() {
		return "DealOfDay [price=" + price + ", discount=" + discount + ", name=" + name + ", minSku=" + minSku + ", totalPrice=" + totalPrice + ", imgAdd=" + imgAdd + "]";
	}
	public DealOfDay(Double price, String discount, String name, String minSku, Double totalPrice, String imgAdd) {
		super();
		this.price = price;
		this.discount = discount;
		this.name = name;
		this.minSku = minSku;
		this.totalPrice = totalPrice;
		this.imgAdd=imgAdd;
	}
	
}
