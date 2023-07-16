public class RewardValue {
    private double cashValue;
    private int milesValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

    public double getCashValue() {
        return cashValue;
    }
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }
    private static double convertToCash(int milesValue) {
        return milesValue*MILES_TO_CASH_CONVERSION_RATE;
    }
//    public void setCashValue(double cashValue) {
//        this.cashValue = cashValue;
//    }
//
//    public void setMilesValue(int milesValue) {
//        this.milesValue = milesValue;
//    }
}

