/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Raiford
 */
package ucf.assignments;

import java.util.ArrayList;

public class ListCollection {
    //ArrayList of ToDoLists toDoLists

    void addList(ToDoList list){
        //add list to toDoLists
    }

    void removeList(String listTitle){
        //set int spot to return value of findListSpot(listTitle)
        //if spot equals -1, output that the list wasn't found and return
        //else remove toDoList at element listNumber from toDoLists
    }

    void saveAllToFile(){
        //for loop for going through each element in toDoLists
            //call saveToFile() for ToDoList in toDoLists
    }

    void readMultipleFromFile(){
        //while true loop
            //open textFile
            //ask user what is the name of the list they want to load from the file or if they want to load all lists
            //set string response to user's input
            //if user input "ALL", "all", or "All"
                //while textFile hasNext() is true
                    //create new ToDoList
                    //call readFromFile for the new ToDoList
                    //call addList and add ToDoList to ListCollection's toToLists
                //return from Function
            //while (textFile hasNext() is true
                 //if(textFile nextLine() is the same as user's input
                    //create new ToDoList
                    //call readFromFile for the new ToDoList
                    //call addList and add ToDoList to ListCollection's toToLists
                    //break while loop
            //ask user if they want to load another list from the file
            //if user input is "no", "n", "NO", or "No", break
    }

    int findListSpot(String listTitle){
        //for loop i going through all elements of toDoLists arrayList
            //if the title of the ToDoList at element i is the same as listTitle, return i
        //return -1 if the element isn't found in the arrayList
        return -1;
    }
}
