package com.sporty.shoes.ShoesModel;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_orderinfo")

public class OrderedShoeModel {
	@Id
	@GeneratedValue  //Automatically added primary key
	private int orderid;
	private int shoeid ;
	private int categeory;
	private double price;
	private int quantity ;
	private Date date;
	
	private String name;
	private String imagelink;
	private double totalprice ;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getShoeid() {
		return shoeid;
	}
	public void setShoeid(int shoeid) {
		this.shoeid = shoeid;
	}
	public int getCategeory() {
		return categeory;
	}
	public void setCategeory(int categeory) {
		this.categeory = categeory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImagelink() {
		return imagelink;
	}
	public void setImagelink(String imagelink) {
		this.imagelink = imagelink;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "OrderedShoeModel [orderid=" + orderid + ", shoeid=" + shoeid + ", categeory=" + categeory + ", price="
				+ price + ", quantity=" + quantity + ", date=" + date + ", name=" + name + ", imagelink=" + imagelink
				+ ", totalprice=" + totalprice + "]";
	}
	public OrderedShoeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderedShoeModel(int shoeid, int categeory, double price, int quantity, Date date, String name,
			String imagelink, double totalprice) {
		super();
		this.shoeid = shoeid;
		this.categeory = categeory;
		this.price = price;
		this.quantity = quantity;
		this.date = date;
		this.name = name;
		this.imagelink = imagelink;
		this.totalprice = totalprice;
	}
	 

}
