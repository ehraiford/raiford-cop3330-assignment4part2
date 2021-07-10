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
        //create date object
        Date date = new Date();
        //if the item isn't already in the list and the date is valid, create an item from the data and add it to the list
        if(!list.containsSameNameItem(addDesc.getText()) && date.confirmValidDate(addDate.getText())){
            ToDoItem item = new ToDoItem();
            item.setCompleted(addComplete.isSelected());
            item.setDescription(addDesc.getText());
            date.setDate(addDate.getText());
            item.setDueDate(date);
            list.addItem(item);
            //update display Area saying item was successfully added.
            displayArea.setText(item.getDescription() + "\nwas added to the to do list.");
            //output message if item could not be added.
        }else displayArea.setText("Could not add item to the List.");
    }

    public void clearAllItems(ActionEvent actionEvent) {
        //if statement ensuring items are in the list.
        if (list.getNumItems() > 0) {
            //for loop for number of items in list and remove item at ticker until they are all gone
            for (int ticker = list.getNumItems() - 1; ticker > -1; ticker--) {
                list.getItems().remove(ticker);
            }
            //set display area saying items were removed.
            displayArea.setText("All Items removed.");
        }
    }

    public void displayIncomplete(ActionEvent actionEvent) {
        //call displayCompleteness passing in false and set displayArea as it.
        displayArea.setText("To Do List:    " + list.getTitle() + "\n\n" + list.displayCompleteness(false));
    }

    public void displayComplete(ActionEvent actionEvent) {
        //call displayCompleteness passing in true and set displayArea as it
       displayArea.setText("To Do List:    " + list.getTitle() + "\n\n" + list.displayCompleteness(true));
    }

    public void displayAll(ActionEvent actionEvent) {
        //call displayAll for list and set displayArea as it
        displayArea.setText("To Do List:    " + list.getTitle() + "\n\n" + list.displayCompleteness(true));
    }

    public void setTitle(ActionEvent actionEvent) {
        //set title to info in textField
        list.setTitle(titleName.getText());
        //update display area
        displayArea.setText("To Do List:    " + list.getTitle());
    }

    public void saveToFile(ActionEvent actionEvent) {
    }

    public void loadFromFile(ActionEvent actionEvent) {
    }
}
