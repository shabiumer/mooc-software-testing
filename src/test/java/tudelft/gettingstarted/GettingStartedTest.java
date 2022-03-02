package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

    @Test
    public void addTentoTen(){
        int result = new GettingStarted().addFive(10);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
    }

    @Test
    public void checkOutCome() {
        int result = new GettingStarted().multiplyTen(5);
        Assertions.assertEquals(50, result);
    }
}
