/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Raiford
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller  extends App{
    //create variables to be displayed in text fields in GUI
//    String existingDescription;
//    String existingDueDate;
//    String listTitle;
//    String originalDescription;
//    String display;
//    boolean existingCompleted;
//    String newDescription;
//    String newDueDate;
//    boolean newCompleted;


    public void loadListClicked(ActionEvent actionEvent) throws Exception {
        Parent loadingList = FXMLLoader.load(getClass().getResource("LoadingLists.fxml"));
        Scene loadScene = new Scene(loadingList);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(loadScene);
        window.show();
    }

    public void newListClicked(ActionEvent actionEvent) throws Exception {
        Parent loadingList = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        Scene loadScene = new Scene(loadingList);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(loadScene);
        window.show();
    }

    public void loadAllClicked(ActionEvent actionEvent) {
        //call readMultipleFromFile
    }

    public void loadListFile(ActionEvent actionEvent) {
        //call readFromFile function for toDoList
    }

    public void EditListClicked(ActionEvent actionEvent) throws Exception {
        Parent loadingList = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        Scene loadScene = new Scene(loadingList);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(loadScene);
        window.show();
    }

    public void editGivenList(ActionEvent actionEvent) throws Exception {
        Parent loadingList = FXMLLoader.load(getClass().getResource("EditList.fxml"));
        Scene loadScene = new Scene(loadingList);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(loadScene);
        window.show();
    }

    public void removeList(ActionEvent actionEvent) {
        //call removeList with given listTitle
    }

    public void saveList(ActionEvent actionEvent) {
        //call findListSpot with given listTitle
        //call saveToFile for that list
    }

    public void SaveAllLists(ActionEvent actionEvent) {
        //call saveAllToFile
    }

    public void displayAll(ActionEvent actionEvent) {
        //call displayAll function for the toDoList
    }

    public void displayCompleted(ActionEvent actionEvent) {
        //call displayCompleteness function passing in value true
    }

    public void DisplayIncomplete(ActionEvent actionEvent) {
        //call displayCompleteness function passing in value false
    }

    public void stopEditing(ActionEvent actionEvent) throws Exception {
        Parent loadingList = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        Scene loadScene = new Scene(loadingList);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(loadScene);
        window.show();
    }

    public void removeItem(ActionEvent actionEvent) {
        //call findListSpot for given listTitle
        //call removeItem for given item Description
    }

    public void addItem(ActionEvent actionEvent) {
        //call findListSpot for given listTitle
        //create new ToDoItem with info put into fields on GUI
        //call addItem adding to ToDoList
    }

    public void editClicked(ActionEvent actionEvent) {
        //call findListSpot looking for given listTitle
        //call findItemSpot looking for given itemDescription
        //call setCompleted for given boolean
        //call setDueDate for given dueDate
        //call setDescription for give description
    }

    public void editTitle(ActionEvent actionEvent) {
        //call findListSpot for original title
        //call setTitle with new title
    }

    public void sortList(ActionEvent actionEvent) {
        //call findListSpot for given title
        //call sortList function for thatToDoList
    }
}
