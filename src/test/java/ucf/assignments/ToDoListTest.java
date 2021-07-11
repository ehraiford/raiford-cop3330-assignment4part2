/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Raiford
 */
package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void setTitle_can_alter_existing_title() {
        //create new ToDoList object
        ToDoList list = new ToDoList();
        //call setTitle setting it to name A
        list.setTitle("Darth Vader");
        //call setTitle setting it to name B
        list.setTitle("Anakin Skywalker");
        //assert that list's title is equal to B
        assertTrue(list.getTitle().compareTo("Anakin Skywalker") == 0);
    }

    @Test
    void addItem_adds_item_to_list() {
        //create new ToDoList object
        ToDoList list = new ToDoList();
        //create toDoItem object a
        ToDoItem item = new ToDoItem();
        //call addItem for a
        list.addItem(item);
        //assert that list contains item
        assertTrue(list.getItems().contains(item));

    }

    @Test
    void removeItem_deletes_item_from_list() {
        //create new ToDoList object
        ToDoList list = new ToDoList();
        //create toDoItem object a
        ToDoItem item = new ToDoItem();
        //set description to String
        item.setDescription("String");
        //call addItem for a
        list.addItem(item);
        //remove item
        list.removeItem(item.getDescription());
        //assert that list does not contain item
        assertFalse(list.getItems().contains(item));
    }

    @Test
    void displayAll_displays_all_items_in_list() {
        //tests number 10
        //create new ToDoList object
        ToDoList list = new ToDoList();
        //create new ToDoListItem A
        ToDoItem a = new ToDoItem();
        Date da = new Date();
        da.setDate("1942-06-30");
        a.setDescription("A");
        a.setDueDate(da);
        a.setCompleted(false);
        //create new ToDOListItem B
        ToDoItem b = new ToDoItem();
        Date db = new Date();
        db.setDate("2015-03-24");
        b.setCompleted(true);
        b.setDescription("B");
        b.setDueDate(db);
        //create new ToDoListItem C
        ToDoItem c = new ToDoItem();
        Date dc = new Date();
        dc.setDate("1994-03-10");
        c.setDueDate(dc);
        c.setCompleted(true);
        c.setDescription("C");
        //addItem A to list
        list.addItem(a);
        //addItem B to list
        list.addItem(b);
        //addItem C to list
        list.addItem(c);
        //create String literal with the expected formatted output of the three items
        String expected = "A\n1942-06-30    Incomplete\n\nB\n2015-03-24    Completed\n\nC\n1994-03-10    Completed\n\n";
        //assert that the literal is the same as the return string from displayAll
        assertTrue(expected.compareTo(list.displayAll()) == 0);
    }

    @Test
    void displayCompleteness_displays_incomplete_items_in_list() {
        //create new ToDoList object
        ToDoList list = new ToDoList();
        //create new ToDoListItem A set as incomplete and fill in information
        ToDoItem a = new ToDoItem();
        a.setCompleted(false);
        a.setDescription("ME");
        Date date = new Date();
        date.setDate("1111-11-11");
        a.setDueDate(date);
        //create new ToDOListItem B set as complete and fill in information
        ToDoItem b = new ToDoItem();
        b.setCompleted(true);
        Date bdate = new Date();
        bdate.setDate("2222-01-22");
        b.setDueDate(bdate);
        b.setDescription("Tedium");
        //addItem A to list
        list.addItem(a);
        //addItem B to list
        list.addItem(b);
        //assert that the output of displayCompleteness matches item A's description
        assert (list.displayCompleteness(false).compareTo("ME\n1111-11-11    Incomplete\n\n") == 0);
    }

    @Test
    void displayCompleteness_displays_complete_items_in_list() {
        //create new ToDoList object
        ToDoList list = new ToDoList();
        //create new ToDoListItem A set as incomplete and fill in information
        ToDoItem a = new ToDoItem();
        a.setCompleted(false);
        a.setDescription("ME");
        Date date = new Date();
        date.setDate("1111-11-11");
        a.setDueDate(date);
        //create new ToDOListItem B set as complete and fill in information
        ToDoItem b = new ToDoItem();
        b.setCompleted(true);
        Date bdate = new Date();
        bdate.setDate("2222-01-22");
        b.setDueDate(bdate);
        b.setDescription("Tedium");
        //addItem A to list
        list.addItem(a);
        //addItem B to list
        list.addItem(b);
        //assert that the output of displayCompleteness matches item B's description
        assert (list.displayCompleteness(true).compareTo("Tedium\n2222-01-22    Completed\n\n") == 0);
    }

    @Test
    void saveToFile_saves_info_to_text_file() throws FileNotFoundException {
        //create new ToDoList object
        ToDoList list = new ToDoList();
        //create new ToDoListItem A set as incomplete and fill in information
        ToDoItem a = new ToDoItem();
        a.setCompleted(false);
        a.setDescription("ME");
        Date date = new Date();
        date.setDate("1111-11-11");
        a.setDueDate(date);
        //create new ToDOListItem B set as complete and fill in information
        ToDoItem b = new ToDoItem();
        b.setCompleted(true);
        Date bdate = new Date();
        bdate.setDate("2222-01-22");
        b.setDueDate(bdate);
        b.setDescription("Tedium");
        //addItem A to list
        list.addItem(a);
        //addItem B to list
        list.addItem(b);
        //call save function
        list.saveToFile();
        //read text from file into a string
        Scanner in = new Scanner("data.txt");
        String actual = in.toString();
        in.close();

        //assert that the actual string is the same as the display info of the list
        assert(list.displayInfo().compareTo(actual)== 0);
    }

    @Test
    void readFromFile_reads_single_toDoList_properly() throws FileNotFoundException {
        //create String information with the formatted information for a ToDoList
        String actual = "HotFire\n1\nBurnThings\n1963-12-25    Completed\n\n";
        //save string to a textFile
        PrintWriter print = new PrintWriter("textdata.txt");
        print.println(actual);
        print.close();
        //create new ToDoList object
        ToDoList list = new ToDoList();
        //call readFromFile reading textFile
        File file = new File("textdata.txt");
        list.readFromFile(file);
        //assert that displayAll of object returns a string identical to information string
        System.out.println(list.displayInfo());
        assert(list.displayInfo().compareTo("HotFire\n1\nBurnThings\n1963-12-25    Completed\n\n") == 0);
    }

    @Test
    void sortList_sorts_by_date() {
        //tests number 10
        //create new ToDoList object
        ToDoList list = new ToDoList();
        //create new ToDoListItem A
        ToDoItem a = new ToDoItem();
        Date da = new Date();
        da.setDate("1942-06-30");
        da.confirmValidDate(da.getDate());
        a.setDescription("A");
        a.setDueDate(da);
        a.setCompleted(false);
        //create new ToDOListItem B
        ToDoItem b = new ToDoItem();
        Date db = new Date();
        db.setDate("2015-03-24");
        db.confirmValidDate(db.getDate());
        b.setCompleted(true);
        b.setDescription("B");
        b.setDueDate(db);
        //create new ToDoListItem C
        ToDoItem c = new ToDoItem();
        Date dc = new Date();
        dc.setDate("1994-03-10");
        dc.confirmValidDate(dc.getDate());
        c.setDueDate(dc);
        c.setCompleted(true);
        c.setDescription("C");
        //addItem A to list
        list.addItem(a);
        //addItem B to list
        list.addItem(b);
        //addItem C to list
        list.addItem(c);
        //create String literal with the expected formatted output of the three items
        String expected = "A\n1942-06-30    Incomplete\n\nC\n1994-03-10    Completed\n\nB\n2015-03-24    Completed\n\n";
        //sort list
        list.sortList();
        //assert that the literal is the same as the return string from displayAll
        assertTrue(expected.compareTo(list.displayAll()) == 0);

    }

}