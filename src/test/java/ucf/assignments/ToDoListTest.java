/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Raiford
 */
package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void setTitle_can_alter_existing_title(){
        //tests requirement 8
        //create new ToDoList object
        //call setTitle setting it to name A
        //call setTitle setting it to name B
        //assert that list's title is equal to B
    }

    @Test
    void addItem_adds_item_to_list(){
        //tests requirement 9
        //create new ToDoList object
        //create toDoItem object a
        //call addItem for a
        //assert that list contains object a
    }
    @Test
    void removeItem_deletes_item_from_list(){
        //tests requirement 10
        //create new ToDoList object
        //create todoItem object a
        //call addItem for a
        //create toDoItem object b
        //call addItem for b
        //call removeItem for a
        //assert that the only item in the list is item b
    }

    @Test
    void displayAll_displays_all_items_in_list(){
        //tests requirement 14
        //create new ToDoList object
        //create new ToDoListItem A
        //create new ToDOListItem B
        //create new ToDoListItem C
        //addItem A to list
        //addItem B to list
        //addItem C to list

        //create String literal with the expected formatted output of the three items

        //assert that the literal is the same as the return string from displayAll
    }

    @Test
    void displayCompleteness_displays_incomplete_items_in_list(){
        //tests requirement 15
        //create new ToDoList object
        //create new ToDoListItem A set as incomplete
        //create new ToDOListItem B set as complete
        //create new ToDoListItem C set as complete
        //create new ToDoListItem D set as incomplete
        //create new ToDoListItem E set as complete
        //create new ToDoListItem F set as incomplete
        //addItem A to list
        //addItem B to list
        //addItem C to list
        //addItem D to list
        //addITem E to list
        //addItem F to list

        //create String literal with the expected formatted output of the three incomplete items

        //assert that the literal is the same as the return string from displayCompleteness
    }

    @Test
    void displayCompleteness_displays_complete_items_in_list(){
        //tests requirement 16
        //create new ToDoList object
        //create new ToDoListItem A set as incomplete
        //create new ToDOListItem B set as complete
        //create new ToDoListItem C set as complete
        //create new ToDoListItem D set as incomplete
        //create new ToDoListItem E set as complete
        //create new ToDoListItem F set as incomplete
        //addItem A to list
        //addItem B to list
        //addItem C to list
        //addItem D to list
        //addITem E to list
        //addItem F to list

        //create String literal with the expected formatted output of the three complete items

        //assert that the literal is the same as the return string from displayCompleteness
    }

    @Test
    void saveToFile_saves_info_to_text_file(){
        //tests requirement 17
        //create new ToDoList object
        //create toDoListItem a and add it to list
        //create toDoListItem b and add it to list
        //create toDoListItem c and add it to list
        //call saveToFile
        //close file
        //reopen file and create a string actual with the information in it
        //create a string with the expected formatted information
        //assert that actual is the same as expected
    }

    @Test
    void readFromFile_reads_single_toDoList_properly(){
        //test requirement 19
        //create String information with the formatted information for a ToDoList
        //save string to a textFile
        //create new ToDoList object
        //call readFromFile reading textFile
        //assert that displayAll of object returns a string identical to information string
    }

    @Test
    void sortList_sorts_by_date(){
        //create new ToDoList()
        //create new item with far away date and add it to list
        //create new item with soon date and add it to list
        //create new item with middle date and add it to list
        //call sortList function
        //create String expected with the info of the items in the correct order by date
        //assert that the displayAll function return value is the same as expected String
    }

}