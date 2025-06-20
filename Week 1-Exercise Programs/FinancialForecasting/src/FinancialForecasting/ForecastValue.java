package FinancialForecasting;

public class ForecastValue {

	public static double forecastValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return forecastValue(presentValue * (1 + rate), rate, years - 1);
    }
	
}
