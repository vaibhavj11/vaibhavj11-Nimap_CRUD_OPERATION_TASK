package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Category_Table")
public class Category {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String disc;

	@OneToMany
	private List<Product> l1;

	
	
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

	public String getDisc() {
		return disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}

	public List<Product> getL1() {
		return l1;
	}

	public void setL1(List<Product> l1) {
		this.l1 = l1;
	}

	public Category(int id, String name, String disc, List<Product> l1) {
		super();
		this.id = id;
		this.name = name;
		this.disc = disc;
		this.l1 = l1;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", disc=" + disc + ", l1=" + l1 + "]";
	}
	
	

	
	
}
