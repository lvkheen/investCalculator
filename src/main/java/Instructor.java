import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Instructor {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void sayHello(){
        System.out.println("Добро пожаловать в ИнвестКалькулятор v0.1!");
    }

    public int enterStartDepo(User user) throws IOException {
        System.out.println("Введите сумму первоначального взноса:");
        int startDepo = Integer.parseInt(reader.readLine());
        user.setStartDepo(startDepo);
        user.depo.add(user.getStartDepo());                                 // добавляем в список с депо начальную сумму
        return user.getStartDepo();
    }

    public int enterMonthlyPayment(User user) throws IOException {
        System.out.println("Введите сумму ежемесячного взноса:(в разработке)"); // Ежемесячные пополнения не учитываются
        int monthlyPayment = Integer.parseInt(reader.readLine());
        user.setMonthlyPayment(monthlyPayment);
        return user.getMonthlyPayment();
    }

    public int enterInvestmentPeriod(User user) throws IOException {
        System.out.println("Введите срок инвестирования (в годах):");
        int investmentPeriod = (Integer.parseInt(reader.readLine()));           // Инвест. период в годах
        user.setInvestmentPeriod(investmentPeriod);
        return user.getInvestmentPeriod();
    }

    public double enterInterestRate(User user) throws IOException {
        System.out.println("Введите номинальную процентную ставку:");
        double interestRate = (Double.parseDouble(reader.readLine())) / 100;    // Процентная ставка в формате 0,05
        user.setInterestRate(interestRate);
        return user.getInterestRate();
    }

    public static void calculateTheResult(User user){
        FinancialCalculator.calculateResult(user);
        System.out.println("Ваше суммарное депо на конец срока составит " +
            user.depo.get(user.depo.size()-1));

        System.out.println("\n------------------------------------------------\n");

        for (int i = 0; i < user.depo.size(); i++){
            System.out.println("Ваше депо на " + i + " год равно " + user.depo.get(i) +
                    " без учета ежемесячных пополнений.");
        }
    }
}
