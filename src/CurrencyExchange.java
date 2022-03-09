public class CurrencyExchange {
    public static void main(String[] args) {

        exchangeCurrency("SEK", 200);


    }

    public static double exchangeCurrency(String currencyID, double value) {
        double conversionRate;
        double newValue = 0;

        switch (currencyID) {
            case "HUF" -> {
                conversionRate = 328.61;
                newValue = value * conversionRate;
                System.out.println("For your " + value + "€, you get " + newValue + "€ in HUF.");
            }
            case "SEK" -> {
                conversionRate = 10.76;
                newValue = value * conversionRate;
                System.out.println("For your " + value + "€, you get " + newValue + "€ in SEK.");
            }
            case "USD" -> {
                conversionRate = 1.12;
                newValue = value * conversionRate;
                System.out.println("For your " + value + "€, you get " + newValue + "€ in USD.");
            }
            case "CAD" -> {
                conversionRate = 1.47;
                newValue = value * conversionRate;
                System.out.println("For your " + value + "€, you get " + newValue + "€ in CAD.");
            }
            default -> System.out.println("Please provide a correct String!");
        }

        return newValue;
    }
}

