package ucf.assignments;

public class Date {
    String date;
    int day, month, year;

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
        int y = Integer.valueOf(date.substring(0, 4));
        int m = Integer.valueOf(date.substring(5, 7));
        int d = Integer.valueOf(date.substring(8, 10));

        //return false if the month or days are longer than possible
        if(m > 12 || d > 31)
            return false;

        //return false if a month that only has thirty days has 31
        if((m == 4 || m == 6 || m == 9 || m == 11) && d == 31 )
            return false;

        //return false if the date if the date is higher than 28 in february during leapyear
        if(((y % 4 == 0 && y % 100 != 0)) || (y % 400 == 0)) {
            if (m == 2 &&  d > 28)
                return false;
            //if not, return if the day is the 29th during non-leapyear
        }else if(m == 2 && d > 29)
            return false;

        //set int versions to values
        this.month = m;
        this.day = d;
        this.year = y;
        //return true if the date wasn't stopped by any of the if statements
        return true;
    }
}
