package view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.awt.Choice;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Main;
import controller.Toy;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.ListView;

import javafx.scene.control.Label;

import javafx.scene.control.Tab;

import javafx.scene.control.RadioButton;

import javafx.scene.input.MouseEvent;
import model.Animals;
import model.BoardGames;
import model.Figures;
import model.Puzzles;
import javafx.scene.control.CheckBox;

import javafx.scene.control.ChoiceBox;

public class MainController implements Initializable{
	private String[] categoryList= {"Figure","Animal","Board Game","Puzzle"};
	private String[] classification= {"Action","Doll","History"};
	private String [] type= {"Mechanical","Cryptic","Logic","Trivia","Riddle"};
	private String[] size= {"Small","Medium","Large"};
	public static ArrayList<String>pay= new ArrayList<>();
	public static Figures figu = new Figures();
	public static Animals ani = new Animals();
	public static BoardGames bg = new BoardGames();;
	public static Puzzles puzz = new Puzzles();
	@FXML
	private Tab home;
	@FXML
	private ListView<String> homeListView;
	@FXML
	private Button homePurchase;
	@FXML
	private RadioButton homeSNbtn1;
	@FXML
	private RadioButton homeNamebtn2;
	@FXML
	private RadioButton homeTypebtn3;
	@FXML
	private TextField homeSN;
	@FXML
	private TextField homeName;
	@FXML
	private TextField homeType;
	@FXML
	private Button homeSearch;
	@FXML
	private Button homeReset;
	@FXML
	private Button homeClear;
	@FXML
	private Tab addItem;
	@FXML
	private ChoiceBox addCategory;
	@FXML
	private TextField addSN;
	@FXML
	private TextField addName;
	@FXML
	private TextField addPrice;
	@FXML
	private TextField addCount;
	@FXML
	private TextField addAge;
	@FXML
	private TextField addBrand;
	@FXML
	private Button addSavebtn;
	@FXML
	private ChoiceBox toyClassification;
	@FXML
	private TextField addMaterial;
	@FXML
	private ChoiceBox puzzleType;
	@FXML
	private TextField addBoarGameMin;
	@FXML
	private TextField addBoarGameMax;
	@FXML
	private Label snAddError;
	@FXML
	private TextField addBookAuthor;
	@FXML
	private TextField addAge1;
	@FXML
	private ChoiceBox toySize;
	@FXML
	private Tab removeItem;
	@FXML
	private ListView removeListView;
	@FXML
	private TextField removeSN;
	@FXML
	private Button removeSearchbtn;
	@FXML
	private Button removeBtn;
	@FXML
	private Label removeLabel;
	@FXML
	private Tab Recommendation;
	@FXML
	private ListView recommendationListView;
	@FXML
	private CheckBox recommendationAgeCB;
	@FXML
	private CheckBox recommendationTypeCB;
	@FXML
	private CheckBox recommendationPriceCB;
	@FXML
	private TextField recommendationAge;
	@FXML
	private TextField recommendationPriceMin;
	@FXML
	private ChoiceBox recommendationType;
	@FXML
	private TextField recommendationPriceMax;
	@FXML
	private Button recommendationSearchBtn;
	@FXML
	private Button recommendationPurchaseBtn;
	

	// Event Listener on Button[#homePurchase].onAction
	@FXML
	public void homePurchaseAction(ActionEvent event) {
		
	}
	// Event Listener on Button[#homeSearch].onAction
	@FXML
	public void homeSearchAction(ActionEvent event) throws FileNotFoundException {
//		String choice="";
//		if (homeSNbtn1.isSelected())
//		{
//			choice = homeSN.getText();
//		}
//		else if (homeNamebtn2.isSelected())
//		{
//			choice = homeName.getText();
//		}
//		else 
//		{
//			choice = homeType.getText();
//		}
//		homeListView.getItems().addAll(Toy.search (choice,Main.getAll()));
	}
	// Event Listener on Button[#homeReset].onAction
	@FXML
	public void homeResetAction(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#homeClear].onAction
	@FXML
	public void homeClearListAction(ActionEvent event) {
		// TODO Autogenerated
	}
	@FXML
	public void searchInventoryRB(ActionEvent event) 
	{
		
	}

	// Event Listener on Button[#addSavebtn].onAction
	@FXML
	public void addSaveAction(ActionEvent event) throws FileNotFoundException {
//		if (addString().contains("Figure"))
//		{
//			Toy.addNew(addString(),Main.getFigures());
//		}
//		else if (addString().contains("Animal"))
//		{
//			Toy.addNew(addString(), Main.getAnimals());
//		}
//		else if (addString().contains("Board Game"))
//		{
//			Toy.addNew(addString(), Main.getBoardGame());
//		}
//		else {
//			Toy.addNew(addString(), Main.getPuzzles());
//		}
	}


	 //Event Listener on Button[#removeSearchbtn].onAction
	@FXML
	public void removeSearch(ActionEvent event) throws FileNotFoundException {
		 if(Toy.isValid(removeSN.getText()))
         {
               Toy.remove(removeSN.getText(),Main.getAll());
         }
         else
        	 removeLabel.setText(Toy.error);
	}
	// Event Listener on Button[#removeBtn].onAction
	@FXML
	public void removeItem(ActionEvent event) throws FileNotFoundException {
		if(Toy.isValid(removeSN.getText()))
        {
              Toy.remove(removeSN.getText(),Main.getAll());
        }
        else
       	 removeLabel.setText(Toy.error);
	}
	// Event Listener on Button[#recommendationSearchBtn].onAction
	@FXML
	public void recommendationSearchAction(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#recommendationPurchaseBtn].onAction
	@FXML
	public void recommendationPurchaseAction(ActionEvent event) {
		// TODO Autogenerated
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			homeListView.getItems().addAll(Main.getAll());
			homeListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					pay.add(homeListView.getSelectionModel().getSelectedItem());
										
				}
			});
			addCategory.getItems().addAll(categoryList);
			toyClassification.getItems().addAll(classification);
			puzzleType.getItems().addAll(type);
			toySize.getItems().addAll(size);
			recommendationType.getItems().addAll(categoryList);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * Asks user for toy information
	 * @return Returns serial number, name , brand, etc, belonging to a toy
	 */
	public String addString()
	{
		String newItem = addSN.getText()+";"+addName.getText()+";"
				+addBrand.getText()+";"+addPrice.getText()+";"
				+addCount.getText()+";"+addAge.getText();
		if (addCategory.getValue().equals("Figure"))
		{
			newItem = newItem+";"+toyClassification.getValue();
			figu.add(newItem);
			return figu.toString();
		}
		else if (addCategory.getValue().equals("Animal"))
		{
			newItem = newItem +";"+addMaterial.getText()+";"+toySize.getValue();
			ani.add(newItem);
			return ani.toString();
		}
		else if(addCategory.getValue().equals("Board Game"))
		{
			newItem = newItem +";"+addBoarGameMin.getText()+";"+addBoarGameMax.getText()+
					";"+addBookAuthor.getText();
			bg.add(newItem);
			return bg.toString();
		}
		else 
		{
			newItem = newItem +";"+puzzleType.getValue();
			puzz.add(newItem);
			return puzz.toString();
		}
	}

}
