/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Raiford
 */
package ucf.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ToDoList {
    //String for the title of the list
    private String title;
    //array list of the items on the to do list
    private ArrayList<ToDoItem> items = new ArrayList<ToDoItem>();
    //int for number of items in list.
    private int numItems;
    //boolean tracking if the list was created from a file.
    private boolean fileRead;

    public boolean getFileRead(){
        return fileRead;
    }
    public int getNumItems() {
        return numItems;
    }
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
            display = display + this.items.get(i).displayInfo()+"\n";
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
                display = display + this.items.get(i).displayInfo() + "\n";
        }
        //return string
        return display;
    }

    void saveToFile() throws FileNotFoundException {
        //create new filewriter object.
        PrintWriter writer = new PrintWriter("data.txt");
        //write list.displayInfo to file.
        writer.print(displayInfo());
        //close file
        writer.close();
    }

    void readFromFile(File textFile) throws FileNotFoundException {
        //create scanner
        Scanner in = new Scanner(textFile);
        //set boolean of file read to true.
        this.fileRead = true;
        //set title to nextLine() from textFile
        this.title = in.nextLine();
        //read number of items from file
        this.numItems = Integer.parseInt(in.nextLine());
        //if there are items in the file
        if(in.hasNext()) {
            //for loop going through numItems times
            for (int ticker = 0; ticker < this.numItems; ticker++) {
                if (in.hasNext()) {
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
                    if (comp.compareTo("Completed") == 0)
                        item.setCompleted(true);
                    else item.setCompleted(false);
                    //add item to to arrayList of items
                    this.addItem(item);
                    //numItems - 1 since the class normally counts them itself
                    this.numItems--;
                    //move scanner to next item
                    in.nextLine();
                    in.nextLine();
                }
            }
        }
        in.close();
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

    String displayInfo(){
        String info = this.title + "\n";
        info = info + numItems + "\n";
        info = info + this.displayAll();
        return info;
    }

    void editArrayItem(String description, boolean complete, Date date, int spot){
        //update the info for the item at the given spot in the arrayList
        this.items.get(spot).setDueDate(date);
        this.items.get(spot).setDescription(description);
        this.items.get(spot).setCompleted(complete);
    }

    String returnArraySpotDescription(int i){
        return items.get(i).getDescription();
    }

    String returnArraySpotDueDate(int i){
        return items.get(i).getDueDate().getDate();
    }

    boolean returnArraySpotCompleted(int i){
        return items.get(i).getCompleted();
    }
}
