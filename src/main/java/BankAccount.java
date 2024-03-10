import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private double balance;
    private int overdraft;

    private String accountType;

//    private double amount;

    // ** create constructor
    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber,double balance, int overdraft, String accountType) {
        //   property     parameter
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;

    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
    public void withdraw(int amount) {

        this.balance -= amount;

    }

    public double calculateInterest(double percentage) {
        double interestPay = this.balance * percentage;
        return interestPay;

    }
    public void payInterest(double percentage) {
        double interestToPay = this.balance * percentage;
        this.balance += interestToPay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String  dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    //    public static String getFirstName(String firstName) {
//        return firstName;
//    }
//
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public static String getLastName(String lastName) {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public static int getDateOfBirth(int year, int month, int day) {
//        return year + month + day;
//    }
//
//    public void setDatOfBirth(LocalDate dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public static int getAccountNumber(int accountNumber) {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(int accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public static double getBalance(double balance) {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public static double deposit(double balance, double deposit) {
//        return balance + deposit;
//    }
//    public static double withdrawal(double balance, double withdrawal) {
//        return balance - withdrawal;
//    }
//
//    public static double payInterest(double balance) {
//        double interest = 0.04 * balance;
//        return balance + interest;
//
//    }




}
