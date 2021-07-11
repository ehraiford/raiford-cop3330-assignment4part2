package ucf.assignments;

public class Date {
    String date;

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    boolean confirmValidDate(String date){

        //return false if the string is not 10 characters or if there are not hyphens at the correct spot
        if(date.length()!=10 || date.charAt(4) != '-' || date.charAt(7) != '-')
            return false;
        //parse integer versions of the year month and day from the string
        int year = Integer.valueOf(date.substring(0, 4));
        int month = Integer.valueOf(date.substring(5, 7));
        int day = Integer.valueOf(date.substring(8, 10));

        //return false if the month or days are longer than possible
        if(month > 12 || day > 31)
            return false;

        //return false if a month that only has thirty days has 31
        if((month == 4 || month == 6 || month == 9 || month == 11) && day == 31 )
            return false;

        //return false if the date if the date is higher than 28 in february during leapyear
        if(((year % 4 == 0 && year % 100 != 0)) || (year % 400 == 0)) {
            if (month == 2 &&  day > 28)
                return false;
            //if not, return if the day is the 29th during non-leapyear
        }else if(month == 2 && day > 29)
            return false;

        //return true if the date wasn't stopped by any of the if statements
        return true;
    }
}
