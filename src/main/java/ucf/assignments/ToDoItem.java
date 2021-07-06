/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Raiford
 */
package ucf.assignments;

public class ToDoItem {
    //boolean for if the item is completed or not
    //String for the description of the item
    //String for due date of the item

      boolean getCompleted(){
//        return completed boolean value
          return true;
      }
      void setCompleted(boolean input){
//    set completed boolean to value passed to function
      }
//
     String getDescription(){
//        return string description for the item
         return "String";
   }

    void setDescription(String input){
//      set description to the string received by the function
    }

        String getDueDate(){
//        return String of DueDate
            return "LITERAL";
    }
//
       void setDueDate(){
//    start while true loop
//        ask user for due date
//        set a string variable to the value given by user
//        call function to confirm it is in correct format
//        set Due date to the string if the function returns true and end the function
    }
    String displayInfo(){
//        return a string formatted with the values of this Item formatted as "DESCRIPTION\nDUE DATE    COMPLETED"
          return " ";
    }

    boolean confirmFormat(String date){
            //set boolean checker to true
        //set checker to false if date length is not 10
        //set checker to false if fifth char or eighth char is not a hyphen
        //set checker to false if integer equivalent of the month part of date is greater than 12
        //set checker to false if integer equivalent of the day of month is greater than 31
        //return checker
            return true;
    }
}
