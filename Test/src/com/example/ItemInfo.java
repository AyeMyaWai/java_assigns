package com.example;

public class ItemInfo {
	int itemno;
	String name;
	int price;
	public int getItemno() {
		return itemno;
	}
	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ItemInfo(int itemno, String name, int price) {
		super();
		this.itemno = itemno;
		this.name = name;
		this.price = price;
	}
	public ItemInfo() {
		
	}
	
	public String toString() {
		return (this.getItemno()
				+" "+this.getName()+" "+"("+this.getPrice()+")");
		
	}
	
	

}
