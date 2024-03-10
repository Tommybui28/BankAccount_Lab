import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setup() {
        //                                                             need LocalDate ****
        bankAccount = new BankAccount("Tommy", "Bui", "01/01/2000", 00001234, 0.00,-50, "current");
    }

    @Test
    public void canDeposit() {
        bankAccount.deposit(100);
        assertThat(bankAccount.getBalance()).isEqualTo(100);
        // create deposit and get balance - TDD method
    }
    // balance == 0 as before each wipes out the deposit
    @Test
    public void canWithdraw() {
        bankAccount.withdraw(125);
        assertThat(bankAccount.getBalance()).isEqualTo(-125);

    }

    @Test
    public void canPayInterest() {
        bankAccount.deposit(100);
        bankAccount.payInterest(0.02);
        assertThat(bankAccount.getBalance()).isEqualTo(102);
    }

    @Test
    public void hasFirstName() {
        assertThat(this.bankAccount.getFirstName()).isEqualTo("Tommy");
    }

    @Test
    public void canSetFirstName() {
        this.bankAccount.setFirstName("Tommy");
        assertThat(this.bankAccount.getFirstName()).isEqualTo("Tommy");
    }

    @Test
    public void hasLastName() {
        assertThat(this.bankAccount.getLastName()).isEqualTo("Bui");
    }

    @Test
    public void canSetLastName() {
        this.bankAccount.setLastName("lalala");
        assertThat(this.bankAccount.getLastName()).isEqualTo("lalala");
    }

    @Test
    public void hasDateOfBirth() {
        assertThat(this.bankAccount.getDateOfBirth()).isEqualTo("01/01/2000");
    }

    @Test
    public void canSetDateOfBirth() {
        this.bankAccount.setDateOfBirth("02/01/2000");
        assertThat(this.bankAccount.getDateOfBirth()).isEqualTo("02/01/2000");
    }

    @Test
    public void hasAccountNumber() {
        assertThat(this.bankAccount.getAccountNumber()).isEqualTo(00001234);
    }

    @Test
    public void canSetAccountNumber() {
        this.bankAccount.setAccountNumber(0000000);
        assertThat(this.bankAccount.getAccountNumber()).isEqualTo(0000000);
    }

    @Test
    public void canGetBalance() {
        assertThat(this.bankAccount.getBalance()).isEqualTo(0);
    }

    @Test
    public void canSetBalance() {
        this.bankAccount.setBalance(100.0);
        assertThat(this.bankAccount.getBalance()).isEqualTo(100.0);
    }





    // ------------------------------------ Self-work
//    @Test
//    public void canReturnFirstName() {
//        String result = BankAccount.getFirstName("Tommy");
//
//    }
//
//    @Test
//    public void canReturnLastName() {
//        String result = BankAccount.getLastName("Bui");
//
//    }
//
//    @Test
//    public void canReturnDateOfBirth() {
//        LocalDate result = LocalDate.ofEpochDay(BankAccount.getDateOfBirth(2000, 1, 28));
//    }
//
//    @Test
//    public void canReturnAccountNumber() {
//        int result = BankAccount.getAccountNumber(00001234);
//
//    }
//
//    @Test
//    public void canReturnBalance() {
//        double result = BankAccount.getBalance(0.00);
//    }
//
//    @Test
//    public void deposit() {
//        BankAccount bankAccount = new BankAccount();
//        double expected = 45.00;
//        double actual = BankAccount.deposit(0.00, 45.00);
//
//        assertThat(actual).isEqualTo(expected);
//    }
//
//    @Test
//    public void withdrawal() {
//        BankAccount bankAccount = new BankAccount();
//        double expected = 0.00;
//        double actual = BankAccount.withdrawal(45.00, 45.00);
//
//        assertThat(actual).isEqualTo(expected);
//
//
//    }

}