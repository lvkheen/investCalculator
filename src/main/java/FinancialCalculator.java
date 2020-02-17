import java.util.List;

public class FinancialCalculator {

    public static void calculateResult(User user){
        for (int i = 1; i <= user.getInvestmentPeriod(); i++) {
            int p = user.getStartDepo();                                      // Начальная сумма
            double r = user.getInterestRate();                                // Процентная ставка
            double n = 12.0;                                                  // Сколько раз в год начисляется процентная ставка
            int t = i;                                                        // Число лет, длительность инвестиций
            double exponent = n * t;                                          // Степень

            int formula = (int) (p * (Math.pow((1 + (r/n)), exponent)));      // Формула без ежемесячного пополнения

            user.depo.add(formula);
        }
}
}
