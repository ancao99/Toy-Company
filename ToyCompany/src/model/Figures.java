package model;


import controller.Toy;

public class Figures extends Toy{
	public String toString()
	{
		return "Category: Figure;  "+ super.toString()+ "; Classification: "+ arr[6];
	}

}
