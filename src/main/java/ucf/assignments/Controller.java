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

import java.io.IOException;

public class Controller  extends App{

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
    }

    public void loadListFile(ActionEvent actionEvent) {
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
    }

    public void saveList(ActionEvent actionEvent) {
    }

    public void SaveAllLists(ActionEvent actionEvent) {
    }

    public void displayAll(ActionEvent actionEvent) {
    }

    public void displayCompleted(ActionEvent actionEvent) {
    }

    public void DisplayIncomplete(ActionEvent actionEvent) {
    }

    public void stopEditing(ActionEvent actionEvent) throws Exception {
        Parent loadingList = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        Scene loadScene = new Scene(loadingList);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(loadScene);
        window.show();
    }
}
