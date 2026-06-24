public class FinancialForecasting {

    static double calculateAmount(double amount, int years) {
        if (years == 0) {
            return amount;
        }
        return calculateAmount(amount * 1.10, years - 1);
    }

    public static void main(String[] args) {
        double currentAmount = 10000;
        int years = 5;
        double futureAmount = calculateAmount(currentAmount, years);
        System.out.println("Future Amount = " + futureAmount);
    }
}