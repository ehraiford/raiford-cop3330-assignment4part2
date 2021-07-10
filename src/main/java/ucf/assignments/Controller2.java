package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller2 {
    @FXML TextField titleName;
    @FXML TextField addDesc;
    @FXML TextField addDate;
    @FXML TextField editOrigDesc;
    @FXML TextField editNewDesc;
    @FXML TextField editDate;
    @FXML CheckBox addComplete;
    @FXML CheckBox editComplete;
    @FXML TextArea displayArea;
    ToDoList list = new ToDoList();

    public void removeItem(ActionEvent actionEvent) {
    }

    public void displaySort(ActionEvent actionEvent) {
    }

    public void editItem(ActionEvent actionEvent) {
    }

    public void addItem(ActionEvent actionEvent) {
        if(!list.containsSameNameItem(addDesc.getText()) && ){

        }
    }

    public void clearAllItems(ActionEvent actionEvent) {
    }

    public void displayIncomplete(ActionEvent actionEvent) {
    }

    public void displayComplete(ActionEvent actionEvent) {
    }

    public void displayAll(ActionEvent actionEvent) {
    }

    public void setTitle(ActionEvent actionEvent) {

        list.setTitle(titleName.getText());
        displayArea.setText("To Do List:    " + list.getTitle());
    }

    public void saveToFile(ActionEvent actionEvent) {
    }

    public void loadFromFile(ActionEvent actionEvent) {
    }
}
