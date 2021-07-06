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
        //while textFile hasNext() is true
            //create new ToDoList
            //call readFromFile for the new ToDoList
            //call addList and add ToDoList to ListCollection's toToLists
    }

    int findListSpot(String listTitle){
        //for loop i going through all elements of toDoLists arrayList
            //if the title of the ToDoList at element i is the same as listTitle, return i
        //return -1 if the element isn't found in the arrayList
        return -1;
    }
}
