package controller;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import application.Main;

public class Toy {
	
	public String[] arr;
	public String item;
	public static String error ="";
	
	public String[] getItem()
	{
		add(item);
		String [] arr = item.split(";",8);
		this.arr = arr;
		return this.arr;
	}
	
	public void add(String newItem)
	{
		this.item = newItem;
	}
	
	public static String getItem(String removeItem, ArrayList<String>arr)
	{
		for (int i = 0; i<arr.size();i++)
		{
			if (arr.get(i).contains(removeItem))
			{
				return arr.get(i);
			}
		}
		return null;
	}
	public String toString()
	{
		getItem();
		return "Serial Number: "+arr[0]+";  Name: "+ arr[1]+";  Brand: "+ arr[2]+";  Price: "+arr[3]+";  Available-count: "+arr[4]+";  Age-appropriate: "+arr[5];
	}


	/**
	 * Removes an item from an ArrayList based on input
	 * @param SN Serial Number of toy
	 * @param arr ArrayList containing toys
	 * @return 
	 */
	public static String remove(String SN, ArrayList<String> arr)
	{
		int check = 0;
			for (int i = 0; i<arr.size();i++)
			{
				String number =arr.get(i).substring(0,10);
				if (SN.equals(number))
				{
				return SN;
						}
				}
			return null;
	}
	   /*
  * to check if the serial number is valid
  * @param sn 	The serial number
  * @return isValid return true if sn is valid and false if it is not valid 
  */
 public static boolean isValid(String ssn)
 {
     boolean check1 = true;
     
     try{
    	     if (ssn.matches(".*[a-zA-Z].*"))
    	     {
    	     	throw new SNNumberException ("The Serial Number should only contains digits!");
    	     }
    	     else if(ssn.length() != 10)
    	     {
    	         throw new SNNumberException("The Sirial Number's length MUST be 10 digits!");
    	     }
    	 
     }catch(SNNumberException e)
     {
          error = e.toString();
         check1 = false;
     }
 
     return check1;
 }


	

}
