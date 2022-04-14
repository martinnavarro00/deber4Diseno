public abstract class RentalInfoFactory {
    public abstract Address createCountryAddress();
    public abstract PhoneNumber createCountryPhoneNumber();
    public abstract FeeInLocalCurrency createFeeInLocalCurrency();
}
