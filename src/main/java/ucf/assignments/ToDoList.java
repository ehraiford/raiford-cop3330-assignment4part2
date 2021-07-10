/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Raiford
 */
package ucf.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ToDoList {
    //String for the title of the list
    private String title;
    //array list of the items on the to do list
    private ArrayList<ToDoItem> items = new ArrayList<>();

    private int numItems;

    void setTitle(String input){
        //set this list's title to the input to the function
        this.title = input;
    }

    String getTitle(){
        //return title of this list
        return this.title;
    }

    ArrayList getItems(){
        //return this object's list of items
        return this.items;
    }

    void addItem(ToDoItem addedItem){
        //add given item to the array list of items
        this.items.add(addedItem);
        this.numItems++;
    }

    String removeItem(String itemDescription){
        String display;
        //set spot integer to the result of findItemSpot function
        int spot = findItemSpot(itemDescription);
        //output that the item was not found if spot integer equals negative 1 and return
        if(spot == -1){
            display = "An item with that description was not found.";
            return display;
        }
        //remove item at the spot location on the arrayList of toDoItems
        this.items.remove(spot);
        //output that the item was removed
        display = "The item was removed.";
        return display;
    }

    String displayAll(){
        //create string object
        String display = "";
        //for loop going through entire arrayList
        for(int i = 0; i < this.items.size(); i++)
            display = display + this.items.get(i).displayInfo();
            //add item's displayInfo() to string
        //return string
        return display;
    }
    String displayCompleteness(boolean completeness){
        //create string object
        String display = "";
        //for loop going through entire arrayList
        for(int i = 0; i< this.items.size(); i++) {
            //if an item's completed boolean matches completeness, add that items displayInfo() to string
            if(this.items.get(i).completed == completeness)
                display = display + this.items.get(i).getDescription();
        }
        //return string
        return display;
    }

    void saveToFile(File textFile){
        //print title of to do list to textFile
        //print number of elements in arraylist to textFile
        //for loop going through each item on the toDoList arrayList
            //print displayInfo() of item to textFile
    }

    void readFromFile(File textFile) throws FileNotFoundException {
        Scanner in = new Scanner(textFile);
        //set title to nextLine() from textFile
        this.title = in.nextLine();
        //local int numItems set to the nextInt() from textFile
        if(in.hasNext())
        this.numItems = Integer.parseInt(in.nextLine());

        if(in.hasNext()) {
            //for loop going through numItems times
            for (int ticker = 0; ticker < this.numItems; ticker++) {
                //create new toDoItem
                ToDoItem item = new ToDoItem();
                //item's description is the nextLine() from textFile
                item.setDescription(in.nextLine());
                //item's due date is the next() from the textFile
                Date date = new Date();
                date.setDate(in.next());
                item.setDueDate(date);
                //item's completed boolean is the next() from the textFile
                String comp = in.next();
                if (comp.compareTo("Complete") == 0)
                    item.setCompleted(true);
                else item.setCompleted(false);
                //add item to to arrayList of items
                this.addItem(item);
            }
        }
    }

    void sortList(){
        //for loop i going through entire arrayList
        for(int i = 0; i < this.items.size(); i++) {
            //for loop k going through all elements in arrayList beyond element i
            for(int k = i+1; k < this.items.size(); k++) {
                //if int equivalent of year from item at k spot is less than that of item at i spot, swap them
                if(this.items.get(k).dueDate.year < this.items.get(i).dueDate.year){
                    Collections.swap(this.items, i, k);
                }else if(this.items.get(k).dueDate.year == this.items.get(i).dueDate.year){
                    //else if year for both elements is the same compare month instead and swap them accordingly
                    if(this.items.get(k).dueDate.month < this.items.get(i).dueDate.month)
                        Collections.swap(this.items, i, k);
                }else if((this.items.get(k).dueDate.year == this.items.get(i).dueDate.year) && (this.items.get(k).dueDate.month < this.items.get(i).dueDate.month)){
                    //else if year and month are both the same, compare day and swap accordingly
                    if(this.items.get(k).dueDate.day < this.items.get(i).dueDate.day)
                        Collections.swap(this.items, i, k);
                }
            }
        }
    }

    int findItemSpot(String itemDescription){
        //for loop i going through each element in arrayList
        for(int i = 0; i < this.items.size(); i++) {
            //if toDoItem at spot i's description is the same as itemDescription, return i
            if(this.items.get(i).description.compareTo(itemDescription) == 0)
                return i;
        }
        //if for loop ends without finding the item, return -1
        return -1;
    }

    boolean containsSameNameItem(String compare){
        for(int ticker = 0; ticker < this.getItems().size(); ticker++){
            if(this.items.get(ticker).getDescription().compareTo(compare) == 0)
                return true;
        }
        return false;
    }

    String displayInfo(){
        String info = this.title + "\n";
        info = info + numItems + "\n";
        info = info + this.displayAll();
        return info;
    }
}
