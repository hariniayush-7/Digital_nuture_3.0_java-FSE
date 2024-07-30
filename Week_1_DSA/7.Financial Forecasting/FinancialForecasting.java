package java_fse_CTS;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public double calculateFutureValue(double presentValue, double rate, int periods) {
        if (periods == 0) {
            return presentValue; // Base case: no more periods to grow
        }
        // Recursive case: apply the growth rate
        return calculateFutureValue(presentValue * (1 + rate), rate, periods - 1);
    }

    public static void main(String[] args) {
        FinancialForecasting forecasting = new FinancialForecasting();
        double presentValue = 1000.0; // Initial investment
        double rate = 0.05;           // 5% growth rate per period
        int periods = 10;            // Number of periods

        double futureValue = forecasting.calculateFutureValue(presentValue, rate, periods);
        System.out.println("Future Value after " + periods + " periods: $" + futureValue);
    }
}


