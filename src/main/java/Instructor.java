import sun.misc.FloatingDecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Instructor {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void sayHello(){
        System.out.println("Добро пожаловать в ИнвестКалькулятор v0.1!");
    }

    public int enterStartDepo(User user) throws IOException {
        System.out.println("Введите сумму первоначального взноса:");
        int startDepo = (int) (FloatingDecimal.parseFloat(reader.readLine()));

        if(startDepo < 0){
            int newStartDepo = startDepo * (-1);
            System.out.printf("Вы ввели отрицательное значение. Оно автоматически будет заменено "  +
                    "на положительное: %d\n", newStartDepo);
            user.setStartDepo(newStartDepo);
        } else user.setStartDepo(startDepo);

        user.depo.add(user.getStartDepo());                                     // добавляем в список с депо
        return user.getStartDepo();                                             // начальную сумму
    }

    public int enterMonthlyPayment(User user) throws IOException {
        System.out.println("Введите сумму ежемесячного взноса:(в разработке)"); // Ежемесячные пополнения не учитываются
        int monthlyPayment =  (int) (FloatingDecimal.parseFloat(reader.readLine()));

        if (monthlyPayment < 0) {
            int newMonthlyPayment = monthlyPayment * (-1);
            System.out.printf("Вы ввели некорректное значение. Оно будет автоматически заменено " +
                    "на положительное: %d\n", newMonthlyPayment);
            user.setMonthlyPayment(newMonthlyPayment);
        } else  user.setMonthlyPayment(monthlyPayment);

        return user.getMonthlyPayment();
    }

    public int enterInvestmentPeriod(User user) throws IOException {
        System.out.println("Введите срок инвестирования (в годах):");
        int investmentPeriod = (int) (FloatingDecimal.parseFloat(reader.readLine()));         // Инвест. период в годах

        if(investmentPeriod < 0){
            int newInvestmentPeriod = investmentPeriod * (-1);
            System.out.printf("К сожалению, инвестиции в прошлое данная версия калькулятора не предусматривает. " +
                    "Значение будет автоматически заменено на положительное: %d\n", newInvestmentPeriod);
            user.setInvestmentPeriod(newInvestmentPeriod);
        } else user.setInvestmentPeriod(investmentPeriod);

        return user.getInvestmentPeriod();
    }

    public double enterInterestRate(User user) throws IOException {
        System.out.println("Введите номинальную процентную ставку:");
        double interestRate = FloatingDecimal.parseFloat(reader.readLine()) / 100;     // Процентная ставка в формате 0,05
        System.out.println(interestRate);
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
