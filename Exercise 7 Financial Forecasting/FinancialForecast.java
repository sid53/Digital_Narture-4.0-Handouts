package week;
public class FinancialForecast {

    public static void main(String[] args) {
        double initialValue = 1000.0; 
        double growthRate = 0.05;     
        int years = 10;

        double forecastedValue = forecastRecursive(initialValue, growthRate, years);
        System.out.printf("Forecasted value after %d years: %.2f%n", years, forecastedValue);
    }

    public static double forecastRecursive(double principal, double rate, int years) {
        if (years == 0) return principal;
        return forecastRecursive(principal, rate, years - 1) * (1 + rate);
    }
    
    public static double forecastIterative(double principal, double rate, int years) {
        double result = principal;
        for (int i = 0; i < years; i++) {
            result *= (1 + rate);
        }
        return result;
    }
}
