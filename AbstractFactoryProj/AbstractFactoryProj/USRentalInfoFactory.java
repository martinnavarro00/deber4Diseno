public class USRentalInfoFactory extends RentalInfoFactory{
   public Address createCountryAddress()
   {
     return new USAddress();
     
   }
   
   public PhoneNumber createCountryPhoneNumber()
   {
      return new FrenchPhoneNumber();
   }
   
   public FeeInLocalCurrency createFeeInLocalCurrency()
   {
      return new USDollarFee();
   }

}