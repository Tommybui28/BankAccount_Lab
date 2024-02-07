import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    @Test
    public void canReturnFirstName() {
        String result = BankAccount.getFirstName("Tommy");

    }

    @Test
    public void canReturnLastName() {
        String result = BankAccount.getLastName("Bui");

    }

    @Test
    public void canReturnDateOfBirth() {
        LocalDate result = LocalDate.ofEpochDay(BankAccount.getDateOfBirth(2000, 1, 28));
    }

    @Test
    public void canReturnAccountNumber() {
        int result = BankAccount.getAccountNumber(00001234);

    }

    @Test
    public void canReturnBalance() {
        double result = BankAccount.getBalance(0.00);
    }

    @Test
    public void deposit() {
        BankAccount bankAccount = new BankAccount();
        double expected = 45.00;
        double actual = BankAccount.deposit(0.00, 45.00);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void withdrawal() {
        BankAccount bankAccount = new BankAccount();
        double expected = 0.00;
        double actual = BankAccount.withdrawal(45.00, 45.00);

        assertThat(actual).isEqualTo(expected);


    }

}