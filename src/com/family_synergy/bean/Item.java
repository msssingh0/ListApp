package com.family_synergy.bean;

import java.util.Date;

public class Item 
{
	private String itemName;
	private String name;
	private boolean isDateSet;
	private Date endDate;
	private int daysLeft;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isDateSet() {
		return isDateSet;
	}
	public void setDateSet(boolean isDateSet) {
		this.isDateSet = isDateSet;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getDaysLeft() {
		return daysLeft;
	}
	public void setDaysLeft(int daysLeft) {
		this.daysLeft = daysLeft;
	}

	
	
}
