/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Raiford
 */

package ucf.assignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Controller  extends App{

    @FXML TextField dueDate;
    @FXML CheckBox completed;
    @FXML TextField itemDescription;
    @FXML TextField titleInput;
    @FXML TextArea displayArea;
    @FXML TextField result;

    ToDoList list = new ToDoList();

    @FXML  void createList(ActionEvent actionEvent) throws Exception {


        Parent loadingList = FXMLLoader.load(getClass().getResource("CreateList.fxml"));
        Scene loadScene = new Scene(loadingList);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(loadScene);
        window.show();
    }

    @FXML void createListObject(ActionEvent actionEvent) throws Exception {
        if (titleInput.getText().length() > 0) {
            FileWriter writeData = new FileWriter("tempData.txt");
            writeData.write(titleInput.getText());
            list.setTitle(titleInput.getText());

            displayArea.setText(titleInput.getText());

            mainScreen(actionEvent);

        }
    }
    @FXML public void mainScreen(ActionEvent actionEvent) throws Exception {

        File data = new File("tempData.txt");
        list.readFromFile(data);


        Parent loadingList = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        Scene loadScene = new Scene(loadingList);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(loadScene);
        window.show();

    }


    @FXML public void addItemScreen(ActionEvent actionEvent) throws Exception {
        File data = new File("tempData.txt");
        list.readFromFile(data);

        Parent loadingList = FXMLLoader.load(getClass().getResource("AddItem.fxml"));
        Scene loadScene = new Scene(loadingList);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(loadScene);
        window.show();
    }

    @FXML void addItem(ActionEvent actionEvent) throws IOException {
        Date date = new Date();
        if(date.confirmValidDate(dueDate.getText()) && date.confirmValidDate(dueDate.getText()) && !list.containsSameNameItem(itemDescription.getText())) {
            File data = new File("tempData.txt");
            list.readFromFile(data);
            date.setDate(dueDate.getText());
            ToDoItem item = new ToDoItem();
            item.setDescription(itemDescription.getText());
            item.setDueDate(date);
            item.setCompleted(completed.isSelected());
            //call addItem adding to ToDoList
            list.addItem(item);
            displayArea.setText(list.displayAll());
            result.setText("Item added.");
            FileWriter writeData = new FileWriter("tempData.txt");
            writeData.write(list.displayInfo());
        }else result.setText("Unable to add Item.");
    }

    @FXML void editItem(ActionEvent actionEvent) {

    }

    @FXML void editList(ActionEvent actionEvent) {
    }

    @FXML void help(ActionEvent actionEvent) {
    }

   @FXML public void saveList(ActionEvent actionEvent) {
        //call findListSpot with given listTitle
        //call saveToFile for that list
    }

    @FXML void displayAll(ActionEvent actionEvent) {
        //call displayAll function for the toDoList
        System.out.println(list.displayAll());
        displayArea.setText(list.displayAll());
    }

    @FXML void displayCompleted(ActionEvent actionEvent) {
        //call displayCompleteness function passing in value true
    }

    @FXML void DisplayIncomplete(ActionEvent actionEvent) {
        //call displayCompleteness function passing in value false
    }

    @FXML void loadList(ActionEvent actionEvent) {
    }

}
