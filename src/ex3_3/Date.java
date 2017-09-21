package ex3_3;

import java.util.StringTokenizer;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int aYear, int aMonth, int aDay) {
        year = aYear;
        month = aMonth;
        day = aDay;
    }

    @Override
    public String toString() {
        return "[" + year + "-" + month + "-" + day + "]";
    }

    public String getInfo() {
        return toString();
    }

    static public Date stringToDate(String text, String delim) {
        StringTokenizer tokenizer = new StringTokenizer(text, delim);
        String textYear = tokenizer.nextToken();
        String textMonth = tokenizer.nextToken();
        String textDay = tokenizer.nextToken();

        int year = Integer.parseInt(textYear);
        int month = Integer.parseInt(textMonth);
        int day = Integer.parseInt(textDay);

        return new Date(year, month, day);
    }

    public boolean equals(Date other) {
        if (other.year == year
                && other.month == month
                && other.day == day)
            return true;
        else
            return false;
    }
}
