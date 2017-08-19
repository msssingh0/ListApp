package com.family_synergy.interfaces;

import com.family_synergy.bean.Item;

//This is the main Interface which will act as template to other list of various types
//Eg shopping-list, gift-list, wish-list,etc

public interface MyList 
{
	
	public boolean addItem(Item item);
	public boolean removeItem(int index); 
	public boolean removeItem(Item item); 
	public boolean tickItem(Item item);
	public boolean tickItem(int index);
	public int myItemsCount(); 
	public boolean tickAllItems(); 
	public boolean removeAllItems(); 

	
}//end of interface IList
