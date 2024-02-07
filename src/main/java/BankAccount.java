import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;

    private double amount;



    public static String getFirstName(String firstName) {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static String getLastName(String lastName) {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getDateOfBirth(int year, int month, int day) {
        return year + month + day;
    }

    public void setDatOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static int getAccountNumber(int accountNumber) {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static double getBalance(double balance) {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double deposit(double balance, double deposit) {
        return balance + deposit;
    }
    public static double withdrawal(double balance, double withdrawal) {
        return balance - withdrawal;
    }

    public static double interest(double balance) {
        double interest = 0.04 * balance;
        return balance + interest;

    }




}
