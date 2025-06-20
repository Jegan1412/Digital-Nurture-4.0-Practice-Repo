package FinancialForecasting;


public class Test {
    public static void main(String[] args) {
    	
    	ForecastValue forecast1 = new ForecastValue();
    	double forecastvalue = forecast1.forecastValue(1000, 0.05, 5);

        System.out.printf("Future Value : %2f", forecastvalue);
    }
}
