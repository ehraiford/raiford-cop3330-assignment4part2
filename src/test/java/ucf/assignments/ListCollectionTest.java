/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Raiford
 */
package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListCollectionTest {

    @Test
    void addList_addsList_to_Collection(){
        //tests requirement 6
        //create new ToDoList object
        //create new ListCollection object
        //call addList function and add ToDoList to ListCollection
        //assert that the item in the arraylist within ListCollection is the ToDoList object
    }

    @Test
    void removeList_deletes_list_from_collection(){
        //tests requirement 7
        //create new ToDoList object
        //create new ListCollection object
        //call addList function and add ToDoList to ListCollection
        //create 2nd new ToDoList object
        //create 2nd new ListCollection object
        //call addList function and add 2nd ToDoList to ListCollection
        //call remove list for first ToDoList object
        //assert that the only item in listCollection list is the 2nd item
    }

    @Test
    void saveAllToFile_creates_properly_formatted_text_File(){
        //tests requirement 18
        //create ListCollection object
        //create ToDoList and add it to ListCollection
        //create ToDoList B and add it to ListCollection
        //create ToDoList C and add it to ListCollection
        //create String expected
        //call displayAll function for each ToDoList object and add it to expected
        //call saveAllToFile
        //open file and read contents into a string actual
        //assert that expected and actual are the same
    }

    @Test
    void readMultipleFromFile_properly_reads_info(){
        //tests requirement 20
        //create String information with the formatted information for a listCollection of ToDoLists
        //save string to a textFile
        //create new ListCollection object
        //call readMultipleFromFile reading textFile
        //create a string actual of the displayAll for all the ToDoLists in ListCollection
        //assert that actual is the same as information
    }
}