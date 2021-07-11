package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.*;

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

    @FXML void removeItem(ActionEvent actionEvent) {
        //call remove item method in list and display the resulting string to display area
        displayArea.setText(list.removeItem(editOrigDesc.getText()));
    }

    @FXML void displaySort(ActionEvent actionEvent) {
        //call sort method in list.
        list.sortList();
        //display updated sorted list in displayArea
        displayAll(actionEvent);
    }

    @FXML void editItem(ActionEvent actionEvent) {
        //confirm item with original description is in the list.
        int spot = list.findItemSpot(editOrigDesc.getText());
        //create date item with the given info
        Date date = new Date();
        date.setDate(editDate.getText());
        //if it's in there and the provided data is valid, update the variables of the toDoItem with the info in the corresponding fields
        if(spot != -1 && date.confirmValidDate(editDate.getText()) && editNewDesc.getText().length() > 0 && editNewDesc.getText().length() < 257) {
            list.editArrayItem(editNewDesc.getText(), editComplete.isSelected(), date, spot);
            displayArea.setText("The Item has been updated.");

            //if it's not in there, update displayArea with that info.
        }else displayArea.setText("The item could not be updated.");
    }

    @FXML void addItem(ActionEvent actionEvent) {
        //create date object
        Date date = new Date();
        //if the item isn't already in the list and the date is valid, create an item from the data and add it to the list
        if(list.findItemSpot(addDesc.getText()) == -1 && date.confirmValidDate(addDate.getText())){
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

    @FXML void clearAllItems(ActionEvent actionEvent) {
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

    @FXML void displayIncomplete(ActionEvent actionEvent) {
        //call displayCompleteness passing in false and set displayArea as it.
        displayArea.setText("To Do List:    " + list.getTitle() + "\n\n" + list.displayCompleteness(false));
    }

    @FXML void displayComplete(ActionEvent actionEvent) {
        //call displayCompleteness passing in true and set displayArea as it
       displayArea.setText("To Do List:    " + list.getTitle() + "\n\n" + list.displayCompleteness(true));
    }

    @FXML void displayAll(ActionEvent actionEvent) {
        //call displayAll for list and set displayArea as it
        displayArea.setText("To Do List:    " + list.getTitle() + "\n\n" + list.displayAll());
    }

    @FXML void setTitle(ActionEvent actionEvent) {
        //set title to info in textField
        list.setTitle(titleName.getText());
        //update display area
        displayArea.setText("To Do List:    " + list.getTitle());
    }

    @FXML void saveToFile(ActionEvent actionEvent) throws IOException {
        //call saveFile method in list
        list.saveToFile();
        //update display area
        displayArea.setText("List Saved.");

    }

    @FXML void loadFromFile(ActionEvent actionEvent) throws Exception {
        //only do function if file hasn't already been read
        if(!list.getFileRead()) {
            //create new File Object.
            File file = new File("data.txt");
            //if file exists continue method. if not update display area saying so.
            if (!file.createNewFile()) {
                //call readFromFile Function
                list.readFromFile(file);
                //output file to display
                displayArea.setText(list.displayInfo());
                //output to displayArea if not info can be read from file.
            } else displayArea.setText("File does not exist.");
        }else displayArea.setText("File has already been read.");
    }

    @FXML void updatingDescription(ActionEvent actionEvent) {
        //search for location of item in list
        int spot = list.findItemSpot(editOrigDesc.getText());
        //if an item with the description being typed into the field is found, automatically populate the fields with that info
        if(spot != -1){
            editDate.setText(list.returnArraySpotDueDate(spot));
            editNewDesc.setText(list.returnArraySpotDescription(spot));
            editComplete.setSelected(list.returnArraySpotCompleted(spot));
            //update displayArea stating item found
            displayArea.setText("Item found.");
        }
    }
}
