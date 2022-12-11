package model;

import controller.Toy;

public class Animals extends Toy{
	public String toString()
	{
		return "Category: Animals;  "+ super.toString()+ ";  Material: "+ arr[6]+";  Size: "+arr[7];
	}

}
