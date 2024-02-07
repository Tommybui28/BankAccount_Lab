import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BankAccountTest {
    @Test
    public void canReturnFirstName() {
        String result = BankAccount.getFirstName("Tommy");

    }

    @Test
    public  void canReturnLastName() {
        String result = BankAccount.getLastName("Bui");

    }

    @Test
    public void canReturnDateOfBirth()  {
        LocalDate result = LocalDate.ofEpochDay(BankAccount.getDateOfBirth(2000, 1, 28));
    }

    @Test
    public void canReturnAccountNumber() {
        int result = BankAccount.getAccountNumber(00001234);

    }

    @Test
    public void canReturnBalance() {
        double result = BankAccount.getBalance(5000.47);
    }


}
