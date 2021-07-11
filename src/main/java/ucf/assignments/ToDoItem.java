/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Raiford
 */
package ucf.assignments;

public class ToDoItem {
    //boolean for if the item is completed or not
    boolean completed;
    //String for the description of the item
    String description;
    //String for due date of the item
    Date dueDate;
    int month, day, year;

      boolean getCompleted(){
//        return completed boolean value
          return this.completed;
      }
      void setCompleted(boolean input){
//    set completed boolean to value passed to function
          this.completed = input;
      }
//
     String getDescription(){
//        return string description for the item
         return this.description;
   }

    void setDescription(String input){
//      set description to the string received by the function
        this.description = input;
    }

    Date getDueDate(){
//        return String of DueDate
        return this.dueDate;
    }

    void setDueDate(Date input){
          this.dueDate = input;
//    start while true loop
//        ask user for due date
//        set a string variable to the value given by user
//        call function to confirm it is in correct format
//        set Due date to the string if the function returns true and end the function

    }
    String displayInfo(){
          String comp;
          if(this.completed)
             comp = "Completed";
          else comp = "Incomplete";
//        return a string formatted with the values of this Item formatted as "DESCRIPTION\nDUE DATE    COMPLETED"
       return this.description + "\n" + this.dueDate.date + "    " + comp + "\n";
    }


}
