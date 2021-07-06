/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Raiford
 */
package ucf.assignments;

import java.io.File;
import java.util.ArrayList;

public class ToDoList {
    //String for the title of the list
    //array list of the items on the to do list

    void setTitle(String input){
        //set this list's title to the input to the function
    }

    String getTitle(){
        //return title of this list
        return "getTitle";
    }

    ArrayList getItems(){
        //return this object's list of items
        return new ArrayList();
    }

    void addItem(ToDoItem addedItem){
        //add given item to the array list of items
    }

    void removeItem(String itemDescription){
        //set spot integer to the result of findItemSpot function
        //output that the item was not found if spot integer equals negative 1 and return
        //remove item at the spot location on the arrayList of toDoItems
        //output that the item was removed
    }

    String displayAll(){
        //create string object
        //for loop going through entire arrayList
            //add item's displayInfo() to string
        //return string
        return "";
    }
    String displayCompleteness(boolean completeness){
        //create string object
        //for loop going through entire arrayList
            //if an item's completed boolean matches completeness, add that items displayInfo() to string
        //return string
        return " ";
    }

    void saveToFile(File textFile){
        //print title of to do list to textFile
        //print number of elements in arraylist to textFile
        //for loop going through each item on the toDoList arrayList
            //print displayInfo() of item to textFile
    }

    void readFromFile(File textFile){
        //set title to nextLine() from textFile
        //local int numItems set to the nextInt() from textFile
        //for loop going through numItems times
            //create new toDoItem
            //item's description is the nextLine() from textFile
            //item's due date is the next() from the textFile
            //item's completed boolean is the next() from the textFile
            //add item to to arrayList of items
    }

    void sortList(){
        //for loop i going through entire arrayList
            //for loop k going through all elements in arrayList beyond element i
                //if int equivalent of year from item at k spot is less than that of item at i spot, swap them
                //else if year for both elements is the same compare month instead and swap them accordingly
                //else if year and month are both the same, compare day and swap accordingly
    }

    int findItemSpot(String itemDescription){
        //for loop i going through each element in arrayList
            //if toDoItem at spot i's description is the same as itemDescription, return i
        //if for loop ends without finding the item, return -1
        return -1;
    }
}
