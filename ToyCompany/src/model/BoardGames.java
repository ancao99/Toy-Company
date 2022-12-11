package model;

import controller.Toy;

public class BoardGames extends Toy{
	public String toString()
	{
		return "Category: Board Games;  "+ super.toString()+ ";  # of payers: "+ arr[6]+";  Designer(s): "+arr[7];
	}

}
