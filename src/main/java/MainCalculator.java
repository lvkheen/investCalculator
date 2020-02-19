import java.io.IOException;

public class MainCalculator {
    public static void main(String[] args) throws IOException {
        User user = new User();
        Instructor instructor = new Instructor();

        instructor.sayHello();
        instructor.enterStartDepo(user);
        instructor.enterMonthlyPayment(user);
        instructor.enterInvestmentPeriod(user);
        instructor.enterInterestRate(user);
        instructor.calculateTheResult(user);
    }
}
