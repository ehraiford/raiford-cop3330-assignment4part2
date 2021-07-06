/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Raiford
 */
package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoItemTest {

    @Test
    void setDescription_can_change_preexisting_description(){
        //tests requirement 11
        //create new ToDoItem object
        //call setDescription and set it to string alpha
        //call setDescription and set it to string beta
        //assert that description is beta
    }

    @Test
    void setDueDate_can_change_preexisting_date(){
        //tests requirement 12
        //create new ToDoItem object
        //call setDueDate and set it to date one
        //call setDueDate and set it to date two
        //assert that dueDate is equal to date two
    }

    @Test
    void setCompleted_can_be_changed(){
        //tests requirement 13
        //create new ToDoItem object
        //call setCompleted and set it to false
        //call setCompleted and set it to true
        //assert that completed is set to true
    }
}