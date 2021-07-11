/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Raiford
 */
package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.awt.event.ItemEvent;

import static org.junit.jupiter.api.Assertions.*;

class ToDoItemTest {

    @Test
    void setDescription_can_change_preexisting_description(){
        //create new ToDoItem object
        ToDoItem item = new ToDoItem();
        //call setDescription and set it to string alpha
        item.setDescription("Alpha");
        //call setDescription and set it to string beta
        item.setDescription("Beta");
        //assert that description is beta
        assert(item.getDescription().compareTo("Beta") == 0);
    }

    @Test
    void setDueDate_can_change_preexisting_date(){
        //create new ToDoItem object
        ToDoItem item = new ToDoItem();
        //call setDueDate and set it to date one
        Date date = new Date();
        date.setDate("1111-11-11");
        item.setDueDate(date);
        //call setDueDate and set it to date two
        Date date2 = new Date();
        date2.setDate("2000-10-24");
        item.setDueDate(date2);
        //assert that dueDate is equal to date two
        assert(item.getDueDate().getDate().compareTo("2000-10-24") == 0);
    }

    @Test
    void setCompleted_can_be_changed(){
        //create new ToDoItem object
        ToDoItem item = new ToDoItem();
        //call setCompleted and set it to false
        item.setCompleted(false);
        //call setCompleted and set it to true
        item.setCompleted(true);
        //assert that completed is set to true
        assertTrue(item.getCompleted());
    }

    @Test
    void setDescriptionDoesNotAllowObscenelyLongNames(){
        //create string over 255 characters
        String ahh = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhh";
        //creat new item
        ToDoItem item = new ToDoItem();
        //set description to something reasonable
        item.setDescription("Something Reasonable");
        //try to set it to ahh
        item.setDescription(ahh);
        //confirm description is still something reasonable.
        System.out.println(item.getDescription());
        assert(item.getDescription().compareTo("Something Reasonable") == 0);


    }
}