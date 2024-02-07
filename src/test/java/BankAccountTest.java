import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    public void canReturnFirstName() {
        String result = BankAccount.getFirstName("Tommy");

    }

    @Test
    public  void canReturnLastName() {
        String result = BankAccount.getLastName("Bui");

    }
}
