package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void confirmValidDate_returns_true_on_valid_dates(){
        String string = "1942-12-12";
        Date date = new Date();

        assertTrue(date.confirmValidDate(string));
    }

    @Test
    void confirmFormatReturnsTrueOnValidDate(){
        String string = "1942-12-12";
        Date date = new Date();

        assertTrue(date.confirmFormat(string));
    }

    @Test
    void confirmValidDate_returns_false_on_Invalid_Month(){
        String string = "1942-55-12";
        Date date = new Date();

        assertFalse(date.confirmValidDate(string));
    }

    @Test
    void confirmFormatReturnsFalseforWrongLengthString(){
        String string = "1942-2-2";
        Date date = new Date();

        assertFalse(date.confirmFormat(string));
    }

    @Test
    void confirmValidDate_returns_false_on_Invalid_Day(){
        String string = "1942-12-99";
        Date date = new Date();

        assertFalse(date.confirmValidDate(string));
    }

    @Test
    void confirmFormatReturnsFalseMissingHyphens(){
        String string = "19421231";
        Date date = new Date();

        assertFalse(date.confirmFormat(string));
    }
}