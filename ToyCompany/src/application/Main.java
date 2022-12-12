package application;
	
import java.io.*;
import java.util.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Animals;
import model.BoardGames;
import model.Figures;
import model.Puzzles;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application  {
	public static ArrayList<String> figures = new ArrayList<String>();
	public static ArrayList<String> animals= new ArrayList<String>();
	public static ArrayList<String> puzzles= new ArrayList<String>();
	public static ArrayList<String> boardGames= new ArrayList<String>();
	public static ArrayList<String> all= new ArrayList<String>();

	public static Figures figu = new Figures();
	public static Animals ani = new Animals();
	public static BoardGames bg = new BoardGames();;
	public static Puzzles puzz = new Puzzles();
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene =  new Scene(root);
			primaryStage.setTitle("Toy Company");
			primaryStage.setScene(scene);
			primaryStage.show();
			outPutFile();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//read toy item and save in different ArrayList base on its serial number
	public static void readFile () throws FileNotFoundException {
		File inputFile = new File("toy.txt");
		Scanner in = new Scanner (inputFile);
		while (in.hasNextLine())
		{ 
 			String item = in.nextLine();
	 		char firstCharacter = item.charAt(0);
	 		if (firstCharacter=='0'||firstCharacter =='1')
	 		{
	 			figu.add(item);
	 			figures.add(figu.toString());
	 			
	 		}
	 		else if (firstCharacter =='2'||firstCharacter=='3')
	 		{
	 			ani.add(item);
	 			animals.add(ani.toString());
	 		}
	 		else if (firstCharacter =='4'||firstCharacter =='5'||firstCharacter =='6')
	 		{
	 			puzz.add(item);
	 			puzzles.add(puzz.toString());
	 		}
	 		else {
	 			bg.add(item);
	 			boardGames.add(bg.toString());
	 		}
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		launch(args);
	}
	// return list of figure toys
	public static ArrayList<String> getFigures() throws FileNotFoundException
	{
		return figures;
	}
	//return list of animal toys
	public static ArrayList<String> getAnimals() throws FileNotFoundException
	{
		return animals;
	}
	//return list of puzzle toys
	public static ArrayList<String> getPuzzles() throws FileNotFoundException
	{
		return puzzles;
	}
	//return list of board game toys
	public static ArrayList<String> getBoardGame() throws FileNotFoundException
	{
		return boardGames;
	}
	//return list of arrange toys with number
	public static ArrayList<String> getAll() throws FileNotFoundException{
		readFile();
		for (int i=0; i < figures.size() ;i++)
		{
			all.add("("+(i+1)+")  "+figures.get(i));
		}
		for (int i=0; i < puzzles.size() ;i++)
		{
			all.add("("+(i+1+figures.size())+")  "+puzzles.get(i));
		}for (int i=0; i < animals.size() ;i++)
		{
			all.add("("+(i+1+figures.size()+puzzles.size())+")  "+animals.get(i));
		}for (int i=0; i < boardGames.size() ;i++)
		{
			all.add("("+(i+1+figures.size()+puzzles.size()+animals.size())+")  "+boardGames.get(i));
		}
		return all;
	}
	public void outPutFile() throws FileNotFoundException
	{
		PrintWriter out = new PrintWriter ("toys.txt");
		for(String str:getAll())
		{
			out.write(str+System.lineSeparator());
		}
		
	}
}
