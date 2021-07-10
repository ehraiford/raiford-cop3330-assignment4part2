package ucf.assignments;

public class Date {
    String date;
    int year;
    int month;
    int day;

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    boolean confirmValidDate(String date){
        int year = Integer.valueOf(date.substring(0, 4));
        int month = Integer.valueOf(date.substring(5, 7));
        int day = Integer.valueOf(date.substring(8, 10));

        if(month > 12 || day > 31)
            return false;

        if((month == 4 || month == 6 || month == 9 || month == 11) && day == 31 )
            return false;

        if(((year % 4 == 0 && year % 100 != 0)) || (year % 400 == 0)) {
            if (month == 2 &&  day > 28)
                return false;
        }else if(month == 2 && day > 29)
            return false;

        return true;
    }

    boolean confirmFormat(String date){
        //set boolean checker to true
        //set checker to false if date length is not 10
        //set checker to false if fifth char or eighth char is not a hyphen
        if(date.length()!=10 || date.charAt(4) != '-' || date.charAt(7) != '-')
            return false;
        //set checker to false if integer equivalent of the month part of date is greater than 12
        //set checker to false if integer equivalent of the day of month is greater than 31
        //return checker
        return true;
    }
}