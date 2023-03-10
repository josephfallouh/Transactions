//Joseph Fallouh | 1/30/2023 | CSC-280-350

//importing
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class Transactions {

    //declaring variables
    private final String customer; 
    private final Dates date; 
    private final double balance;


    //Transaction consturctor
    public Transactions(String who, Dates when, double amount) {
        customer = who; date = when; balance = amount;
    }

    //Transaction parse constructor 
        public Transactions(String transaction) {
        String[] fields = transaction.split(" ");   // splits the input up by the spaces and puts them into the 'fields' array
        customer = fields[0];   // assigns the first piece seperated from the input to the customer variable

        String dateHold = fields[1];    // creates a new String variable and assigns the second piece pulled from the input 
        String[] fields2 = dateHold.split("/");     // creates a second array, and fills it with MM, DD, YY spliting up the 'datehold' String
        date = new Dates(Integer.parseInt(fields2[0]), Integer.parseInt(fields2[1]), Integer.parseInt(fields2[2]));     // assignes 'date' a Dates value, from what was gathered from the 'fields2' array

        balance = Double.parseDouble(fields[2]);    // assigns the third piece seperated from the input to the balance variable.
    }

    //returns customer
    public String who() { 
        return customer; 
    }
    
    //returns date
    public Dates when() { 
        return date; 
    }
    
    //returns balance
    public double amount() { 
        return balance; 
    }

    //returns customer name, date, and balance
    public String toString() {
        return who() + " " + when() + " " + amount(); 
    }

    public static void main(String[] args) {

        //program asking user to input data
        StdOut.println();
        StdOut.println("Enter last name, date, amount: ");

        //taking in the input the user has entered
        String input = StdIn.readLine();
        Transactions t1 = new Transactions(input);

        //outputing each aspect indivisually 
        StdOut.println();
        StdOut.println("Customer: " + t1.who());
        StdOut.println();
        StdOut.println("Date: " + t1.when());
        StdOut.println();
        StdOut.println("Cash Balance: $" + t1.amount());
        StdOut.println();

        //outputting all of it together (using toString)
        StdOut.println("Account: " + t1.toString());
        StdOut.println();
    }
}