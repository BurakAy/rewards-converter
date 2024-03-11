public class RewardValue {
    private double cashValue;
    private  int milesValue;
    private final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        this.cashValue = this.milesValue * conversionRate;
        return this.cashValue;
    }
    public int getMilesValue() {
        this.milesValue = (int) (this.cashValue / conversionRate);
        return this.milesValue;
    }
}
