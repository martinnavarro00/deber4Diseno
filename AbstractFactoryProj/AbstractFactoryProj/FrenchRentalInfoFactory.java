public class FrenchRentalInfoFactory extends RentalInfoFactory {
    public FrenchRentalInfoFactory() {
    }

    public Address createCountryAddress() {
        return new FrenchAddress();
    }

    public PhoneNumber createCountryPhoneNumber() {
        return new FrenchPhoneNumber();
    }

    public FeeInLocalCurrency createFeeInLocalCurrency() {
        return new FrenchFrancsFee();
    }
}