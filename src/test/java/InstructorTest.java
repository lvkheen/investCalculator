import org.junit.Test;
import java.io.*;

import static org.junit.Assert.assertEquals;

public class InstructorTest{
private static InputStream inputStream;
private static User user = new User();


    @Test
    public void enterStartDepoTest() throws IOException {
        String testIntValue = "300000";
        int startInt = Integer.parseInt(testIntValue);
        inputStream = new ByteArrayInputStream(testIntValue.getBytes());
        System.setIn(inputStream);
        Instructor instructor = new Instructor();

        instructor.enterStartDepo(user);

        assertEquals(startInt, user.getStartDepo());
    }

    @Test
    public void enterMonthlyPaymentTest() throws IOException {
        String testIntValue = "90000";
        int monthlyMayment = Integer.parseInt(testIntValue);
        inputStream = new ByteArrayInputStream(testIntValue.getBytes());
        System.setIn(inputStream);
        Instructor instructor = new Instructor();

        instructor.enterMonthlyPayment(user);

        assertEquals(monthlyMayment, user.getMonthlyPayment());
    }

    @Test
    public void enterInvestmentPeriod() throws IOException {
        String testIntValue = "10";
        int investmentPeriod = Integer.parseInt(testIntValue);
        inputStream = new ByteArrayInputStream(testIntValue.getBytes());
        System.setIn(inputStream);
        Instructor instructor = new Instructor();

        instructor.enterInvestmentPeriod(user);

        assertEquals(investmentPeriod, user.getInvestmentPeriod());
    }

    @Test
    public void enterInterestRate() throws IOException {
        String testIntValue = "8";
        double interestRate =  Double.parseDouble(testIntValue) / 100;
        inputStream = new ByteArrayInputStream(testIntValue.getBytes());
        System.setIn(inputStream);
        Instructor instructor = new Instructor();

        instructor.enterInterestRate(user);

        assertEquals(interestRate, user.getInterestRate(), .0001);
    }

    @Test
    public void calculateTheResult() {
    }
}