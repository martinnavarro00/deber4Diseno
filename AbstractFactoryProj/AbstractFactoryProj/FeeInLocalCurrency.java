

public abstract  class FeeInLocalCurrency {
   protected double dailyFee;
   public void setDailyFee(double dailyFee){
      this.dailyFee = dailyFee;
   }
   public abstract void printDailyRentalFeeInLocalCurrency();

}
