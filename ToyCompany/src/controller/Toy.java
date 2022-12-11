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

//	/**
//	 * Search method, searches for a toy in an ArrayList based on input
//	 * @param input Input to be searcheds
//	 * @param copy Copy of ArrayList containing strings
//	 * @return Returns purchase 
//	 * 
//	 */
//	public double search(String input,ArrayList<String> copy)
//	{
//		ArrayList<String> purchase = new ArrayList<String>();
//		for (int i = 0; i<copy.size();i++)
//		{
//			String a = copy.get(i).toLowerCase();
//			input=input.toLowerCase();
//			String[] array = a.split(";",5);
//			String SN = array[0];
//			String name = array[1];
//			String type =array[2];
//			if (SN.contains(input))
//			{
//				purchase.add(copy.get(i));
//			}
//			else if(name.contains(input))
//			{
//				purchase.add(copy.get(i));
//			}
//			else if (type.contains(input))
//			{
//				purchase.add(copy.get(i));
//			}
//			
//		}
//		return purchase(purchase,copy);
//	}
//	/**
//	 * Purchase method, allows user to purchase a given toy
//	 * @param arr ArrayList containing strings
//	 * @param copy  Copy of ArrayList containing strings
//	 * @return Returns pay amount
//	 */
//	private double purchase(ArrayList<String> arr,ArrayList<String> copy)
//	{
//		Scanner in = new Scanner(System.in);
//		boolean check =true;
//		double pay =0;
//		while (check==true)
//		{	
//		for (String a:arr)
//		{
//			System.out.println(a);
//		}
//		System.out.println("Back to search menu ");
//		System.out.print("Option: ");
//		int option = in.nextInt();
//		option = option - 1;
//		 if (option==arr.size())
//		 {
//			 check=false;
//		 }
//		if (option<arr.size())
//			{String[] array = arr.get(option).split(";",5);
//			Double price =Double.parseDouble( array[3]);
//			pay += price;
//			System.out.println("pay:"+pay);
//			arr.remove(option);
//			copy.remove(option);}
//		}
//		return pay;
//	}
//	/**
//	 * Adds a new value to an ArrayList
//	 * @param arr ArrayList of strings
//	 * @throws FileNotFoundException 
//	 */
//	public void addNew(String in) throws FileNotFoundException
//	{
//		Main.getAll().add(in);
//	}
//
//	/**
//	 * Removes an item from an ArrayList based on input
//	 * @param SN Serial Number of toy
//	 * @param arr ArrayList containing toys
//	 */
//	public void remove(String SN, ArrayList<String> arr)
//	{
//		int check = 0;
//			for (int i = 0; i<arr.size();i++)
//			{
//				String number =arr.get(i).substring(0,10);
//				if (SN.equals(number))
//				{
//					check = i;
//					System.out.print("Do you want to remove?");
//					String ans = in.nextLine().toUpperCase();
//					if (ans.equals("Y"))
//					{
//						arr.remove(check);
//					}
//				}
//			}
//	}
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
