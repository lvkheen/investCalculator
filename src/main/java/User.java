import java.util.ArrayList;
import java.util.List;

public class User {
    private int startDepo;
    private int monthlyPayment;
    private int investmentPeriod;
    private double interestRate;
    public List<Integer> depo = new ArrayList<Integer>();

    public List<Integer> getDepo() {return depo;}

    public double getInterestRate() {return interestRate;}

    public void setInterestRate(double interestRate) {this.interestRate = interestRate;}

    public int getStartDepo() {
        return startDepo;
    }

    public void setStartDepo(int startDepo) {
        this.startDepo = startDepo;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public int getInvestmentPeriod() {return investmentPeriod;}

    public void setInvestmentPeriod(int investmentPeriod) {this.investmentPeriod = investmentPeriod;}
}
