public class Dates {
    private final int month;
    private final int day;
    private final int year;

    public Dates(int m, int d, int y) { 
        month = m; day = d; year = y; 
    }

    public int month() { 
        return month; 
    }

    public int day() { 
        return day; 
    }

    public int year() { 
        return day; 
    }

    public String toString() { 
        return month() + "/" + day() + "/" + year(); 
    }
}