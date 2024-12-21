package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product_Table")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	float price;
	
	@ManyToOne
	private Category c1;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Category getC1() {
		return c1;
	}

	public void setC1(Category c1) {
		this.c1 = c1;
	}

	
	public Product(int id, String name, float price, Category c1) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.c1 = c1;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", c1=" + c1 + "]";
	}
	
	
}
